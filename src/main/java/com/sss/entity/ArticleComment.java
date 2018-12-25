package com.sss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
@TableName("t_article_comment")
@EqualsAndHashCode(callSuper = true)
public class ArticleComment extends BaseEntity {

    @TableField("articleId")
    private String articleId;

    @TableField("comment")
    private String comment;

    @TableField("fatherId")
    private String fatherId;

    @TableField("isFollow")
    private Integer isFollow;

    @TableField("circleId")
    private String circleId;

    @TableField("status")
    private Integer status;

    @TableField("updateTime")
    private Date updateTime;

}