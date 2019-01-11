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
@TableName("t_article_comment")
@EqualsAndHashCode(callSuper = true)
public class ArticleComment extends BaseEntity {
    @TableId(value = "id", type = IdType.UUID)
    private String id;

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

    @TableField("createTime")
    private Date createTime;

}
