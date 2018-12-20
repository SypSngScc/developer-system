package com.sss.dto;

import lombok.Data;
import java.io.Serializable;
import java.util.List;


@Data
public class ResultVO<T> implements Serializable{

    private String code = "200";

    private String msg = "true";

    private List<T> list;

    private Object obj;

    public ResultVO() {

    }

    public ResultVO(String msg) {
        this.msg = msg;
    }

    public ResultVO(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }

    public ResultVO(Object obj, String msg) {
        this.msg = msg;
        this.obj = obj;
    }

}
