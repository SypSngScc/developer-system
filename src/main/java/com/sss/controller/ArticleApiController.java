package com.sss.controller;

import com.sss.dto.PageVO;
import com.sss.entity.Article;
import com.sss.entity.User;
import com.sss.service.ArticleService;
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
@RequestMapping("/article")
public class ArticleApiController extends RestApiController<Article> {

    @Resource
    private ArticleService articleService;

    /*@PostMapping("/query")
    public PageVO<Article> query(@RequestBody Page<Article> page) {
        Page<Article> recordsPage = articleService.selectPage(page);
        return new PageVO<>(recordsPage);
    }

    @PostMapping("/create")
    public ResultVO create(@RequestBody Article entity) {
        ResultVO result = new ResultVO();
        articleService.insert(entity);
        return result;
    }

    @PostMapping("/update")
    public ResultVO update(@RequestBody Article entity) {
        ResultVO result = new ResultVO();
        articleService.updateById(entity);
        return result;
    }

    @PostMapping("/delete")
    public ResultVO delete(@RequestBody Article entity) {
        ResultVO result = new ResultVO();
        articleService.deleteById(entity.getId());
        return result;
    }*/

    /**
     * 根据用户id查找发表的文章
     * @param user
     * @return
     */
    @PostMapping("/findArticle")
    public PageVO<Article> findArticleByUserId(@RequestBody User user){
        return articleService.findArticleByUserId(user);
    }


}
