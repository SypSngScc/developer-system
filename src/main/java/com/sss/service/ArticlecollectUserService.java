package com.sss.service;

import com.sss.dto.ResultVO;
import com.sss.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
public interface ArticlecollectUserService {

    ResultVO findCollectArticleNumByUserId(User user);
}
