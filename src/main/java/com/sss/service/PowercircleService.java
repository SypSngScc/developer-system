package com.sss.service;

import com.sss.dto.ResultVO;
import com.sss.entity.Powercircle;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
public interface PowercircleService {

    ResultVO insert(Powercircle entity);

    ResultVO query();
}
