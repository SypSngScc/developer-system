package com.sss.mapper;

import com.sss.entity.User;
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
public interface UserDao extends BaseMapper<User> {

}