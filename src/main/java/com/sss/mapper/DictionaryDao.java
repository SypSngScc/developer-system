package com.sss.mapper;

import com.sss.entity.Dictionary;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * <p>
  *  dao 接口
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
@Repository
public interface DictionaryDao extends BaseMapper<Dictionary> {

    @Select("select dicValue from t_dictionary where dicName = #{dicName}")
    String getDicValueByDicName(@Param("dicName") String dicName);

}