package com.sss.utils;

import com.sss.dto.PageVO;
import com.sss.dto.ResultVO;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Rest API 基础控制器接口 <br>
 * 包含应该实现的基础方法
 *
 * @param <T> 实体类
 * @author Alex
 */
public abstract class RestApiController<T> {

    /**
     * 分页查询，支持基础条件查询
     *
     * @param entity 实体参数
     * @return 分页结果
     */
    public PageVO<T> query(@RequestBody T entity) {
        return null;
    }

    /**
     * 新建，自动生成的 ID 填充到 entity
     *
     * @param entity 实体参数
     * @return 标准结果
     */
    public ResultVO create(@RequestBody T entity) {
        return null;
    }

    /**
     * 更新，根据 ID 更新
     *
     * @param entity 实体参数
     * @return 标准结果
     */
    public ResultVO update(@RequestBody T entity) {
        return null;
    }

    /**
     * 删除，根据 ID 删除
     *
     * @param entity 实体参数
     * @return 标准结果
     */
    public ResultVO delete(@RequestBody T entity) {
        return null;
    }

}
