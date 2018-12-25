package com.sss.controller.sys;

import com.sss.dto.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionController {

//    @ResponseBody
//    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
//    public ResultVO throwsHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
//        ResultVO result = new ResultVO();
//
//        //方便本地调试
//        e.printStackTrace();
//
//        result.setObj(e.getMessage());
//        result.setMsg("抱歉，服务器出错了");
//        result.setCode(DictStatus.HEADERS_ERROR);
//
//        return result;
//    }
//
//    @ResponseBody
//    @ExceptionHandler(NullPointerException.class)
//    public ResultVO throwsNullPointerException(NullPointerException e) {
//        ResultVO result = new ResultVO();
//
//        //方便本地调试
//        e.printStackTrace();
//
//        result.setMsg("抱歉，服务器出错了");
//        result.setObj(e.getMessage());
//        result.setCode(DictStatus.NULL_POINTER);
//
//        return result;
//    }
//
//    @ResponseBody
//    @ExceptionHandler(value = {BadSqlGrammarException.class, SQLException.class})
//    public ResultVO throwsBadSqlGrammarException(BadSqlGrammarException b, SQLException s) {
//        ResultVO result = new ResultVO();
//
//        //方便本地调试
//        b.printStackTrace();
//        s.printStackTrace();
//
//        result.setMsg("抱歉，服务器出错了");
//        result.setObj(b.getMessage() + "<<<>>>" + s.getMessage());
//        result.setCode(DictStatus.database_exception);
//
//        return result;
//    }
//
//    @ResponseBody
//    @ExceptionHandler(value = {JsonSyntaxException.class, JsonMappingException.class, JSONException.class})
//    public ResultVO throwsJSONException(JsonSyntaxException j, JsonMappingException s, JSONException e) {
//        ResultVO result = new ResultVO();
//
//        //方便本地调试
//        e.printStackTrace();
//        j.printStackTrace();
//        s.printStackTrace();
//
//        result.setMsg("抱歉，服务器出错了");
//        result.setObj(j.getMessage() + "<<<>>>" + s.getMessage() + "<<<>>>" + e.getMessage());
//        result.setCode(DictStatus.json_exception);
//
//        return result;
//    }
//
//    @ResponseBody
//    @ExceptionHandler(value = {NoClassDefFoundError.class, ClassNotFoundException.class, ClassCastException.class})
//    public ResultVO throwsClassException(ClassNotFoundException c, NoClassDefFoundError n, ClassCastException e) {
//        ResultVO result = new ResultVO();
//
//        //方便本地调试
//        e.printStackTrace();
//        n.printStackTrace();
//        c.printStackTrace();
//
//        result.setMsg("抱歉，服务器出错了");
//        result.setObj(c.getMessage() + "<<<>>>" + n.getMessage() + "<<<>>>" + e.getMessage());
//        result.setCode(DictStatus.class_exception);
//
//        return result;
//    }
//
//    @ResponseBody
//    @ExceptionHandler(value = {HttpMessageNotReadableException.class})
//    public ResultVO throwsHttpMessageNotReadableException(HttpMessageNotReadableException e) {
//        ResultVO result = new ResultVO();
//
//        //方便本地调试
//        e.printStackTrace();
//
//        result.setObj(e.getMessage());
//        result.setMsg("抱歉，服务器出错了");
//        result.setCode(DictStatus.json_exception);
//
//        return result;
//    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResultVO throwsException(Exception e) {
        ResultVO result = new ResultVO();

        //方便本地调试
        e.printStackTrace();

        result.setObj(e.getMessage());
        result.setMsg("抱歉，服务器出错了");
        result.setCode("500");

        return result;
    }

    @ResponseBody
    @ExceptionHandler(Error.class)
    public ResultVO throwsError(Error e) {
        ResultVO result = new ResultVO();

        //方便本地调试
        e.printStackTrace();

        result.setObj(e.getMessage());
        result.setMsg("系统错误");
        result.setCode("300");

        return result;
    }

}
