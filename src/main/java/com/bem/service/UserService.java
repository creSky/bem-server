package com.bem.service;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.UserDomain;
import com.bem.entity.MapEntity;
import com.bem.util.PropertiesUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.common.json.utils.GsonUtils;
import com.riozenc.titanTool.spring.web.client.TitanTemplate;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public List<MapEntity> findMapByDomain(UserDomain userDomain) {
        String result = restTemplate.postForObject("http://AUTH-CENTER/auth/user/findMapByDomain", userDomain,
                String.class);
        HttpResult<List<MapEntity>> mapEntityList =
                JSONObject.parseObject(result,HttpResult.class);
        List<MapEntity> list=  mapEntityList.getResultData();
        return list;
    }


}
