package com.sss.dto;

import com.baomidou.mybatisplus.plugins.Page;
import lombok.Data;

/**
 * @author shiyuping
 * @version 1.0
 */
@Data
public class PageVO<T> extends ResultVO<T> {

    private int current = 1;

    private int size = 10;

    private int total;

    private int pages;

    public PageVO() {

    }

    public PageVO(int current, int size) {
        this.size = size;
        this.current = current;
    }

    public Page<T> page() {

        return new Page<>(this.current, this.size);
    }


    public PageVO(Page<T> page) {

        this.setSize(page.getSize());
        this.setPages(page.getPages());
        this.setTotal(page.getTotal());
        this.setList(page.getRecords());
        this.setCurrent(page.getCurrent());

    }


    //    /**
//     * UID
//     */
//    private static final long serialVersionUID = -4544110913033419261L;
//
//    /**
//     * 总数
//     */
//    private int total;
//
//    /**
//     * 排列(升序降序)
//     */
//    private String order;
//
//    /**
//     * 每页行数
//     */
//    private int limit;
//
//    /**
//     * 偏移量
//     */
//    private int offsetoffset;
//
//    /**
//     * 是否继续循环
//     */
//    private int isShow;
//
//    /**
//     * 正在计算中的id
//     */
//    private String logo;
//
//    /**
//     * index值
//     */
//    private int rowId;
//
//    /**
//     * 保存每行记录的Token
//     */
//    private String token;
//
//    /**
//     * 行数
//     */
//    private List<T> rows = new ArrayList<T>();

//    protected void toPage(Pagination pagination, List<T> list) {
//        this.setTotal(pagination.getTotal());
//        this.setRows(list);
//    }

}
