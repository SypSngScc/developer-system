package com.sss.service.impl;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sss.dto.ResultVO;
import com.sss.entity.ArticlecollectUser;
import com.sss.entity.User;
import com.sss.mapper.ArticlecollectUserDao;
import com.sss.service.ArticlecollectUserService;
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
public class ArticlecollectUserServiceImpl extends ServiceImpl<ArticlecollectUserDao, ArticlecollectUser> implements ArticlecollectUserService {

    @Override
    @SuppressWarnings("unchecked")
    public ResultVO findCollectArticleNumByUserId(User user) {
        ResultVO result = new ResultVO();
        if (user == null || StringUtils.isEmpty(user.getId())){
            result.setMsg("参数错误");
            result.setCode(ErrorCode.PARAM_ERROR);
            return result;
        }
        int num = this.selectCount(new Condition().eq("articleId", user.getId()).eq("status", 0));
        result.setObj(num);
        return result;
    }
}
