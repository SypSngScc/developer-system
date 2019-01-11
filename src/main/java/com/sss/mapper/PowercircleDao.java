package com.sss.mapper;

import com.sss.entity.Powercircle;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
  *  dao 接口
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
@Repository
public interface PowercircleDao extends BaseMapper<Powercircle> {

    @Select("select * from t_powercircle where status = 1")
    List<Powercircle> findAllPowercircle();
}