package com.sss.entity;


import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotations.KeySequence;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import java.util.Date;

@KeySequence(clazz = String.class)
@Data
public class BaseEntity {

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @TableField(exist = false)
    @JSONField(serialize = false)
    private int size = 10;

    @TableField(exist = false)
    @JSONField(serialize = false)
    private int current = 1;

//    @TableField(exist = false)
//    private String orderBySeq;

//    @TableField(exist = false)
//    private Pagination page = new Pagination();

//	@TableField(exist = false)
//	private String gsys = "gsys";

//    @TableField(exist = false)
//    private String token;

    private Date insertTime;
//
//	@TableField(exist = false)
//	private String alpha;


    public void setId(String id) {
        if (id == null || "".equals(id.trim())) {
            this.id = null;
        }
        this.id = id;
    }
}
