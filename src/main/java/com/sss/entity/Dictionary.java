package com.sss.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("t_dictionary")
public class Dictionary{
    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @TableField("dict_name")
    private String dictName;

    @TableField("dict_value")
    private String dictValue;

    @TableField("type")
    private String type;

    @TableField("memo")
    private String memo;

}
