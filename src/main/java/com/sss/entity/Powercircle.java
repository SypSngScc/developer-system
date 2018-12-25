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
@TableName("t_powercircle")
@EqualsAndHashCode(callSuper = true)
public class Powercircle extends BaseEntity {

    @TableField("circleName")
    private String circleName;

    @TableField("circleCreator")
    private String circleCreator;

    @TableField("avatar")
    private String avatar;

    @TableField("tag")
    private String tag;

    @TableField("intro")
    private String intro;

    @TableField("status")
    private Integer status;

    @TableField("updateTime")
    private Date updateTime;

}
