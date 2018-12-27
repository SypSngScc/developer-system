package com.sss.service;

import com.baomidou.mybatisplus.service.IService;
import com.sss.dto.PageVO;
import com.sss.entity.Article;
import com.sss.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
public interface ArticleService extends IService<Article> {

    PageVO<Article> findArticleByUserId(User user);
}
