package com.sss.service.impl;

import com.baomidou.mybatisplus.mapper.Condition;
import com.sss.dto.ResultVO;
import com.sss.entity.Powercircle;
import com.sss.mapper.PowercircleDao;
import com.sss.service.PowercircleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
@Service
public class PowercircleServiceImpl implements PowercircleService {

    @Resource
    PowercircleDao powercircleDao;

    @Override
    public ResultVO insert(Powercircle entity) {
        ResultVO resultVO = new ResultVO();
        powercircleDao.insert(entity);
        return resultVO;
    }

    @Override
    public ResultVO query() {
        ResultVO resultVO = new ResultVO();
        List<Powercircle> allPowercircle = powercircleDao.findAllPowercircle();
        resultVO.setList(allPowercircle);
        return resultVO;
    }
}
