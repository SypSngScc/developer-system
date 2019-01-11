package com.sss.controller;

import com.sss.dto.ResultVO;
import com.sss.utils.OSSClientUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

/**
 * created by shiyuping on 2019/1/11
 */
@RestController
public class UploadFileController {

    @GetMapping("/upload/{fileId}")
    public void load(@PathVariable("fileId") int fileId, HttpServletRequest request, HttpServletResponse response){

    }

    @PostMapping("/upload")
    public ResultVO upload(HttpServletRequest request, HttpServletResponse response){
        ResultVO resultVO = new ResultVO();
        long startTime=System.currentTimeMillis(); //获取开始时间
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //判断request是否有文件上传
        if(multipartResolver.isMultipart(request)){
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
            Iterator<String> ite = multiRequest.getFileNames();
            while(ite.hasNext()){
                MultipartFile file = multiRequest.getFile(ite.next());
                if(file!=null){
                    //上传oss
                    String originalFilename = file.getOriginalFilename();
                    String substring = originalFilename.substring(originalFilename.lastIndexOf(".")).toLowerCase();
                    Random random = new Random();
                    String name = random.nextInt(10000) + System.currentTimeMillis() + substring;
                    String url = OSSClientUtil.uploadObject2OSS((File) file, name);
                    resultVO.setObj(url);
                }
            }
        }
        //获取结束时间
        long endTime=System.currentTimeMillis();
        System.out.println("上传文件共使用时间："+(endTime-startTime));
        //return "success";
        return resultVO;
    }
}
