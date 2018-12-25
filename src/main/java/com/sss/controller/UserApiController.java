package com.sss.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.sss.dto.PageVO;
import com.sss.dto.ResultVO;
import com.sss.entity.User;
import com.sss.service.UserService;
import com.sss.utils.RestApiController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  API 控制器
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
@RestController
@RequestMapping("/user")
public class UserApiController extends RestApiController<User> {

    @Resource
    private UserService userService;

    @PostMapping("/query")
    public PageVO<User> query(@RequestBody Page<User> page) {
        Page<User> recordsPage = userService.selectPage(page);
        return new PageVO<>(recordsPage);
    }

    @PostMapping("/create")
    public ResultVO create(@RequestBody User entity) {
        ResultVO result = new ResultVO();
        userService.insert(entity);
        return result;
    }

    @PostMapping("/update")
    public ResultVO update(@RequestBody User entity) {
        ResultVO result = new ResultVO();
        userService.updateById(entity);
        return result;
    }

    @PostMapping("/delete")
    public ResultVO delete(@RequestBody User entity) {
        ResultVO result = new ResultVO();
        userService.deleteById(entity.getId());
        return result;
    }

}
