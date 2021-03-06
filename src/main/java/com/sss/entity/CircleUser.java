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
@TableName("t_circle_user")
@EqualsAndHashCode(callSuper = true)
public class CircleUser extends BaseEntity {

    @TableField("circleId")
    private String circleId;

    @TableField("userId")
    private String userId;

    @TableField("status")
    private Integer status;

    @TableField("updateTime")
    private Date updateTime;


}
