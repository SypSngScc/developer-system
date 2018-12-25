package com.sss.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sss.entity.Article;
import com.sss.mapper.ArticleDao;
import com.sss.service.ArticleService;
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
public class ArticleServiceImpl extends ServiceImpl<ArticleDao, Article> implements ArticleService {

}
