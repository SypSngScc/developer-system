package com.sss.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.sss.dto.PageVO;
import com.sss.dto.ResultVO;
import com.sss.entity.CircleUser;
import com.sss.service.CircleUserService;
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
@RequestMapping("/circleUser")
public class CircleUserApiController extends RestApiController<CircleUser> {

    @Resource
    private CircleUserService circleUserService;

    @PostMapping("/query")
    public PageVO<CircleUser> query(@RequestBody Page<CircleUser> page) {
        Page<CircleUser> recordsPage = circleUserService.selectPage(page);
        return new PageVO<>(recordsPage);
    }

    @PostMapping("/create")
    public ResultVO create(@RequestBody CircleUser entity) {
        ResultVO result = new ResultVO();
        circleUserService.insert(entity);
        return result;
    }

    @PostMapping("/update")
    public ResultVO update(@RequestBody CircleUser entity) {
        ResultVO result = new ResultVO();
        circleUserService.updateById(entity);
        return result;
    }

    @PostMapping("/delete")
    public ResultVO delete(@RequestBody CircleUser entity) {
        ResultVO result = new ResultVO();
        circleUserService.deleteById(entity.getId());
        return result;
    }

}
