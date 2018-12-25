package com.sss.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sss.entity.User;
import com.sss.mapper.UserDao;
import com.sss.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
