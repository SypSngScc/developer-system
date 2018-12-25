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
@TableName("t_articlelike_user")
@EqualsAndHashCode(callSuper = true)
public class ArticlelikeUser extends BaseEntity {

    @TableField("articleId")
    private String articleId;

    @TableField("userId")
    private String userId;

    @TableField("circleId")
    private String circleId;

    @TableField("status")
    private Integer status;

    @TableField("updateTime")
    private Date updateTime;

}
