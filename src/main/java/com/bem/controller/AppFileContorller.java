package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.AppFile;
import com.bem.file.FileUtil;
import com.bem.mapper.AppFileMapper;
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

@Controller
@RequestMapping(value = "/appFile")
public class AppFileContorller {

    @Autowired
    private AppFileMapper appFileMapper;


    /**
     *
     * @param file
     * @param request
     * @return
     */
    @RequestMapping(value = "/upload")
    @ResponseBody
    public RestultContent upload(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) {
        RestultContent restultContent = new RestultContent();
        try {
            AppFile appfile = FileUtil.upload(request, file);
            //补充文件上传人 工单号 环节号
            if (appfile != null) {
                appFileMapper.insert(appfile);
                restultContent.setData(appfile);
                restultContent.setStatus(200);
            } else {
                restultContent.setErrorMsg("文件上传失败");
            }
        } catch (IOException e) {
            restultContent.setErrorMsg("文件上传失败");
        }
        return restultContent;
    }


    /**
     * 
     * @param fileJson
     * @param httpServletResponse
     * @return
     */
    @RequestMapping(value = "/downLoad")
    @ResponseBody
    public RestultContent downLoad(@RequestBody String fileJson, HttpServletResponse httpServletResponse) {
        AppFile appFile= JSONObject.parseObject(fileJson,AppFile.class);
        AppFile returnFile=appFileMapper.selectOne(appFile);
        return null;
    }

}
