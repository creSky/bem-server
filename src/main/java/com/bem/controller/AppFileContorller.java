package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppFile;
import com.bem.mapper.AppFileMapper;
import com.bem.util.BemCommonUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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
    public HttpResult upload(String appFileJson,
                             HttpServletRequest request) {
        AppFile appFile = JSONObject.parseObject(appFileJson, AppFile.class);
        //补充文件上传人 工单号 环节号
        appFile.setUploadDate(new Date());
        appFile.setUploadManId(BemCommonUtil.getOpeartorId(appFileJson));
        boolean isExist = appFileMapper.existsWithPrimaryKey(appFile);
        if (isExist) {
            appFileMapper.insert(appFile);
        } else {

        }
        appFileMapper.insert(appFile);
        return new HttpResult(HttpResult.SUCCESS, "保存成功", appFile);
    }


    /**
     * @param fileJson
     * @return
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public HttpResult delete(@RequestBody String fileJson) {
        AppFile appFile = JSONObject.parseObject(fileJson, AppFile.class);
        int num = appFileMapper.deleteByPrimaryKey(appFile);
        if (num > 0) {
            return new HttpResult(HttpResult.SUCCESS, "删除成功", null);
        } else {
            return new HttpResult(HttpResult.ERROR, "删除失败", null);
        }
    }


}
