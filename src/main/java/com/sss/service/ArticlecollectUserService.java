package com.sss.service;

import com.baomidou.mybatisplus.service.IService;
import com.sss.dto.ResultVO;
import com.sss.entity.ArticlecollectUser;
import com.sss.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
public interface ArticlecollectUserService extends IService<ArticlecollectUser> {

    ResultVO findCollectArticleNumByUserId(User user);
}
