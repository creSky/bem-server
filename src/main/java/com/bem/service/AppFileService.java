package com.bem.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppFile;
import com.bem.domain.AppFileExample;
import com.bem.mapper.AppFileMapper;
import com.bem.util.BemCommonUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AppFileService {

    @Autowired
    private AppFileMapper appFileMapper;


    /**
     * @param appFileJson
     * @param
     * @return
     */
    public List<AppFile> upload(String appFileJson) {
        //获得appFile对象
        AppFile appFile = JSONObject.parseObject(appFileJson, AppFile.class);
        //补充文件上传人 工单号 环节号
        appFile.setUploadDate(new Date());
        appFile.setUploadManId(BemCommonUtil.getOpeartorId(appFileJson));
        //取出后台地址数组
        JSONObject appFileJsonObject = JSONObject.parseObject(appFileJson);
        JSONArray jsonArray = appFileJsonObject.getJSONArray("relativePath");


        if (null == jsonArray || jsonArray.size() == 0) {
            return null;
        }

        List<AppFile> appFiles = new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            appFile.setId(null);
            appFile.setFilePath(jsonArray.get(i).toString());
            String fileName = jsonArray.get(i).toString();
            appFile.setFileType(fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()));
            System.out.println("文件类型=====" + appFile.getFileType());
            appFile.setFileName(fileName.substring(fileName.lastIndexOf(File.separator) + 1, fileName.length()));
            appFileMapper.insert(appFile);
            appFiles.add(appFile);
        }
        return appFiles;
    }


    /**
     * @param fileJson
     * @param httpServletResponse
     * @return
     */
    public HttpResult downLoad(@RequestBody String fileJson, HttpServletResponse httpServletResponse) {
        AppFile appFile = JSONObject.parseObject(fileJson, AppFile.class);
        AppFile returnFile = appFileMapper.selectOne(appFile);
        return null;
    }

    //判断改环节有没有文件
    public boolean existsFile(String appId, String taskId) {
        AppFileExample appFileExample = new AppFileExample();
        com.bem.domain.AppFileExample.Criteria appFileCriteria =
                appFileExample.createCriteria();
        appFileCriteria.andAppIdEqualTo(new Long(appId)).
                andTaskIdEqualTo(taskId);
        List<AppFile> appFiles = appFileMapper.selectByExample(appFileExample);
        if (appFiles.size() >= 1) {
            return true;
        }
        return false;
    }
}
