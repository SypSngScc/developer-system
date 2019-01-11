package com.sss.service.impl;

import com.sss.dto.PageVO;
import com.sss.entity.Article;
import com.sss.entity.User;
import com.sss.mapper.ArticleDao;
import com.sss.service.ArticleService;
import com.sss.utils.ErrorCode;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    ArticleDao articleDao;

    @Override
    @SuppressWarnings("unchecked")
    public PageVO<Article> findArticleByUserId(User user) {
        PageVO<Article> result = new PageVO<>();
        if (user == null || StringUtils.isEmpty(user.getId())){
            result.setMsg("参数错误");
            result.setCode(ErrorCode.PARAM_ERROR);
            return result;
        }

        return null;
    }
}
