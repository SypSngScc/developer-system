package com.sss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
@Data
@TableName("t_article")
@EqualsAndHashCode(callSuper = true)
public class Article extends BaseEntity {

    @TableField("title")
    private String title;

    @TableField("author")
    private String author;

    @TableField("circleId")
    private String circleId;

    @TableField("content")
    private String content;

    @TableField("likeNum")
    private Integer likeNum;

    @TableField("collectNum")
    private Integer collectNum;

    @TableField("readNum")
    private Integer readNum;

    @TableField("status")
    private Integer status;

    @TableField("updateTime")
    private Date updateTime;

}
