package com.sss.service.impl;

import com.sss.dto.ResultVO;
import com.sss.entity.Dictionary;
import com.sss.mapper.DictionaryDao;
import com.sss.service.DictionaryService;
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
public class DictionaryServiceImpl implements DictionaryService {

    @Resource
    DictionaryDao dictionaryDao;

    @Override
    public ResultVO insert(Dictionary entity) {
        ResultVO resultVO = new ResultVO();
        dictionaryDao.insert(entity);
        return resultVO;
    }
}
