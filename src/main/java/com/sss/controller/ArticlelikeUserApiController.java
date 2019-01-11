package com.sss.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.sss.dto.PageVO;
import com.sss.dto.ResultVO;
import com.sss.entity.ArticlelikeUser;
import com.sss.service.ArticlelikeUserService;
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
@RequestMapping("/articlelikeUser")
public class ArticlelikeUserApiController extends RestApiController<ArticlelikeUser> {

    @Resource
    private ArticlelikeUserService articlelikeUserService;

    /*@PostMapping("/query")
    public PageVO<ArticlelikeUser> query(@RequestBody Page<ArticlelikeUser> page) {
        Page<ArticlelikeUser> recordsPage = articlelikeUserService.selectPage(page);
        return new PageVO<>(recordsPage);
    }

    @PostMapping("/create")
    public ResultVO create(@RequestBody ArticlelikeUser entity) {
        ResultVO result = new ResultVO();
        articlelikeUserService.insert(entity);
        return result;
    }

    @PostMapping("/update")
    public ResultVO update(@RequestBody ArticlelikeUser entity) {
        ResultVO result = new ResultVO();
        articlelikeUserService.updateById(entity);
        return result;
    }

    @PostMapping("/delete")
    public ResultVO delete(@RequestBody ArticlelikeUser entity) {
        ResultVO result = new ResultVO();
        articlelikeUserService.deleteById(entity.getId());
        return result;
    }*/

}
