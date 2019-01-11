package com.sss.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.sss.dto.PageVO;
import com.sss.dto.ResultVO;
import com.sss.entity.Powercircle;
import com.sss.service.PowercircleService;
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
@RequestMapping("/powercircle")
public class PowercircleApiController extends RestApiController<Powercircle> {

    @Resource
    private PowercircleService powercircleService;

    /*
    @PostMapping("/update")
    public ResultVO update(@RequestBody Powercircle entity) {
        ResultVO result = new ResultVO();
        powercircleService.updateById(entity);
        return result;
    }

    @PostMapping("/delete")
    public ResultVO delete(@RequestBody Powercircle entity) {
        ResultVO result = new ResultVO();
        powercircleService.deleteById(entity.getId());
        return result;
    }*/
    @PostMapping("/create")
    public ResultVO create(@RequestBody Powercircle entity) {
        return powercircleService.insert(entity);
    }

    @PostMapping("/query")
    public ResultVO query() {
        return powercircleService.query();
    }

}
