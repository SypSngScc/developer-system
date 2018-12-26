package com.sss.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.sss.annotation.Dictionary;
import com.sss.entity.BaseEntity;
import com.sss.mapper.DictionaryDao;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.jackson.JsonComponent;

import javax.annotation.Resource;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutionException;

/**
 * created by shiyuping on 2018/12/25
 */
@JsonComponent
public class CusomSerializer extends JsonSerializer<BaseEntity> {

    @Resource
    private DictionaryDao dictionaryDao;

    private LoadingCache<String, String> cache = CacheBuilder.newBuilder().build(new CacheLoader<String, String>() {
        @Override
        public String load(String dictName) throws Exception {
            String dictValue = dictionaryDao.getDicValueByDicName(dictName);
            return dictValue;
        }
    });

    @Override
    public void serialize(BaseEntity value, JsonGenerator gen, SerializerProvider serializerProvider) throws IOException {
        gen.writeStartObject();
        Field[] fields = value.getClass().getDeclaredFields();
        Class<? extends BaseEntity> class1 = value.getClass();
        //String className = class1.getName();
        for (Field field : fields){
            field.setAccessible(true);
            try {
                if (field.isAnnotationPresent(Dictionary.class)){
                    String dicName = (String)field.get(value);
                        if (StringUtils.isNotEmpty(dicName)){
                            if (dicName.contains(",")){
                                String[] strings = dicName.split("," );
                                StringBuilder sb = new StringBuilder();
                                for (String string : strings){
                                    String s = cache.get(string);
                                    sb.append(s);
                                }
                                gen.writeObjectField(field.getName()+"text",sb.toString());
                            }else {
                                String s = cache.get(dicName);
                                gen.writeObjectField(field.getName()+"text",s);
                            }
                        }
                    }
                    if (field.getType() == Date.class){
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        String time = sdf.format(field.get(value));
                        gen.writeObjectField(field.getName(), time);
                    }else {
                        gen.writeObjectField(field.getName(), field.get(value));
                    }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ExecutionException e){
                e.printStackTrace();
            }
        }
        gen.writeEndObject();
    }
}
