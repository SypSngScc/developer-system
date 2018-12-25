package com.sss.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.sss.dto.PageVO;
import com.sss.dto.ResultVO;
import com.sss.entity.ArticlecollectUser;
import com.sss.service.ArticlecollectUserService;
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
@RequestMapping("/articlecollectUser")
public class ArticlecollectUserApiController extends RestApiController<ArticlecollectUser> {

    @Resource
    private ArticlecollectUserService articlecollectUserService;

    @PostMapping("/query")
    public PageVO<ArticlecollectUser> query(@RequestBody Page<ArticlecollectUser> page) {
        Page<ArticlecollectUser> recordsPage = articlecollectUserService.selectPage(page);
        return new PageVO<>(recordsPage);
    }

    @PostMapping("/create")
    public ResultVO create(@RequestBody ArticlecollectUser entity) {
        ResultVO result = new ResultVO();
        articlecollectUserService.insert(entity);
        return result;
    }

    @PostMapping("/update")
    public ResultVO update(@RequestBody ArticlecollectUser entity) {
        ResultVO result = new ResultVO();
        articlecollectUserService.updateById(entity);
        return result;
    }

    @PostMapping("/delete")
    public ResultVO delete(@RequestBody ArticlecollectUser entity) {
        ResultVO result = new ResultVO();
        articlecollectUserService.deleteById(entity.getId());
        return result;
    }

}
