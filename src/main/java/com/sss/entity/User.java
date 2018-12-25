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
@TableName("t_user")
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    @TableField("userName")
    private String userName;

    @TableField("avatar")
    private String avatar;

    @TableField("department")
    private String department;

    @TableField("intestPoint")
    private String intestPoint;

    @TableField("status")
    private Integer status;

    @TableField("updateTime")
    private Date updateTime;

}