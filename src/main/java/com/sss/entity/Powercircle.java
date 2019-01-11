package com.sss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.sss.annotation.Dictionary;
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
@TableName("t_powercircle")
@EqualsAndHashCode(callSuper = true)
public class Powercircle extends BaseEntity {

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @TableField("circleName")
    private String circleName;

    @TableField("circleCreator")
    private String circleCreator;

    @TableField("avatar")
    private String avatar;

    @TableField("tag")
    @Dictionary
    private String tag;

    @TableField("intro")
    private String intro;

    @TableField("status")
    private Integer status;

    @TableField("updateTime")
    private Date updateTime;

    @TableField("createTime")
    private Date createTime;

}
