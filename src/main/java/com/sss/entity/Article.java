package com.sss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.*;

import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author syp
 * @since 2018-12-25
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

    @TableField("authorId")
    private String authorId;

}
