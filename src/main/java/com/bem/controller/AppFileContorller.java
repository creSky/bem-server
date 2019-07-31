package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.AppFile;
import com.bem.file.FileUtil;
import com.bem.mapper.AppFileMapper;
import com.bem.util.BemCommonUtil;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping(value = "/appFile")
public class AppFileContorller {

    @Autowired
    private AppFileMapper appFileMapper;


    /**
     * @param appFileJson
     * @param request
     * @return
     */
    @RequestMapping(value = "/save")
    @ResponseBody
    public RestultContent upload(String appFileJson,
                                 HttpServletRequest request) {
        RestultContent restultContent = new RestultContent();
        AppFile appFile = JSONObject.parseObject(appFileJson, AppFile.class);
        //补充文件上传人 工单号 环节号
        appFile.setUploadDate(new Date());
        appFile.setUploadManId(BemCommonUtil.getOpeartorId(appFileJson));
        boolean isExist = appFileMapper.existsWithPrimaryKey(appFile);
        if(isExist){
            appFileMapper.insert(appFile);
        }else{

        }
        appFileMapper.insert(appFile);
        restultContent.setData(appFile);
        restultContent.setStatus(200);
        return restultContent;
    }


    /**
     * @param fileJson
     * @return
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public RestultContent delete(@RequestBody String fileJson) {
        AppFile appFile = JSONObject.parseObject(fileJson, AppFile.class);
        appFileMapper.deleteByPrimaryKey(appFile);
        RestultContent restultContent=new RestultContent();
        restultContent.setStatus(200);
        restultContent.setData(appFile);
        return restultContent;
    }


}
