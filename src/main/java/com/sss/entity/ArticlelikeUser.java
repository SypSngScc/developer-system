package com.sss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
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
