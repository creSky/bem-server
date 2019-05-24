package com.bem.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.AppFile;
import com.bem.mapper.AppFileMapper;
import com.bem.util.BemCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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


        if(null==jsonArray || jsonArray.size()==0){
            return null;
        }

        List<AppFile> appFiles=new ArrayList<>();
        for (int i = 0; i < jsonArray.size(); i++) {
            appFile.setId(null);
            appFile.setFilePath(jsonArray.get(i).toString());
            String fileName = jsonArray.get(i).toString();
            appFile.setFileType(fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()));
            appFile.setFileName(fileName.substring(fileName.lastIndexOf(File.separator)+1, fileName.length()));
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
    public RestultContent downLoad(@RequestBody String fileJson, HttpServletResponse httpServletResponse) {
        AppFile appFile = JSONObject.parseObject(fileJson, AppFile.class);
        AppFile returnFile = appFileMapper.selectOne(appFile);
        return null;
    }
}
