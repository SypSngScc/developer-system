package com.sss.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.sss.dto.PageVO;
import com.sss.dto.ResultVO;
import com.sss.entity.ArticleComment;
import com.sss.service.ArticleCommentService;
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
@RequestMapping("/articleComment")
public class ArticleCommentApiController extends RestApiController<ArticleComment> {

    @Resource
    private ArticleCommentService articleCommentService;

    @PostMapping("/query")
    public PageVO<ArticleComment> query(@RequestBody Page<ArticleComment> page) {
        Page<ArticleComment> recordsPage = articleCommentService.selectPage(page);
        return new PageVO<>(recordsPage);
    }

    @PostMapping("/create")
    public ResultVO create(@RequestBody ArticleComment entity) {
        ResultVO result = new ResultVO();
        articleCommentService.insert(entity);
        return result;
    }

    @PostMapping("/update")
    public ResultVO update(@RequestBody ArticleComment entity) {
        ResultVO result = new ResultVO();
        articleCommentService.updateById(entity);
        return result;
    }

    @PostMapping("/delete")
    public ResultVO delete(@RequestBody ArticleComment entity) {
        ResultVO result = new ResultVO();
        articleCommentService.deleteById(entity.getId());
        return result;
    }

}
