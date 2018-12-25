package com.sss.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.sss.dto.PageVO;
import com.sss.dto.ResultVO;
import com.sss.entity.Dictionary;
import com.sss.service.DictionaryService;
import com.sss.utils.RestApiController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * <p>
 *  API 控制器
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
@RestController
@RequestMapping("/dictionary")
public class DictionaryApiController extends RestApiController<Dictionary> {

    @Resource
    private DictionaryService dictionaryService;

    @PostMapping("/query")
    public PageVO<Dictionary> query(@RequestBody Page<Dictionary> page) {
        Page<Dictionary> recordsPage = dictionaryService.selectPage(page);
        return new PageVO<>(recordsPage);
    }

    @PostMapping("/create")
    public ResultVO create(@RequestBody Dictionary entity) {
        ResultVO result = new ResultVO();
        dictionaryService.insert(entity);
        return result;
    }

    @PostMapping("/update")
    public ResultVO update(@RequestBody Dictionary entity) {
        ResultVO result = new ResultVO();
        dictionaryService.updateById(entity);
        return result;
    }

    @PostMapping("/delete")
    public ResultVO delete(@RequestBody Dictionary entity) {
        ResultVO result = new ResultVO();
        dictionaryService.deleteById(entity.getId());
        return result;
    }

}
