package com.sss.service.impl;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sss.dto.PageVO;
import com.sss.dto.ResultVO;
import com.sss.entity.Article;
import com.sss.entity.User;
import com.sss.mapper.ArticleDao;
import com.sss.service.ArticleService;
import com.sss.utils.ErrorCode;
import org.apache.commons.lang3.StringUtils;
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

    @Override
    @SuppressWarnings("unchecked")
    public PageVO<Article> findArticleByUserId(User user) {
        PageVO<Article> result = new PageVO<>();
        if (user == null || StringUtils.isEmpty(user.getId())){
            result.setMsg("参数错误");
            result.setCode(ErrorCode.PARAM_ERROR);
            return result;
        }
        Page<Article> page = this.selectPage(new Page<>(user.getCurrent(), user.getSize()),
                new Condition()
                        .eq("articleId", user.getId())
                        .eq("status", 0)
                        .orderBy("createTime",false));
        return new PageVO(page);
    }
}
