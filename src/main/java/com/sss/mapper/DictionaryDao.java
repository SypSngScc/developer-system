package com.sss.mapper;

import com.sss.entity.Dictionary;
import com.baomidou.mybatisplus.mapper.BaseMapper;
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

    String getDicValueByDicName(String dicName);

}