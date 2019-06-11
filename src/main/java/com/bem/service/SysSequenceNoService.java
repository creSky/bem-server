package com.bem.service;

import com.bem.domain.SysSequenceNo;
import com.bem.mapper.SysSequenceNoMapper;
import com.bem.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class SysSequenceNoService {
    @Autowired
    private SysSequenceNoMapper sysSequenceNoMapper;

    //户号生成规则
    //营业区域后三位+七位自增长数字
    public String getUserNo(String busi) {
        //去营业区域后三位
        int busiLenth = busi.length();
        String noPre = null;
        if (busiLenth >= 3) {
            noPre = busi.substring(busiLenth - 3, busiLenth);
        } else {
            noPre = busi;
        }
        String userNoCode = "USER_NO" + noPre;
        SysSequenceNo sysSequenceNo = new SysSequenceNo();
        sysSequenceNo.setCode(userNoCode);
        sysSequenceNo.setFormat("0000000");
        sysSequenceNo.setPrefix(noPre);
        sysSequenceNo.setName("户号(GGDL)");
        String maxNo = genSequenceNo(sysSequenceNo);
        return noPre + maxNo;

    }

    //户号生成规则
    //营业区域后三位+年+月+日+自增长四位
    public String getAppNo(String busi) {
        //去营业区域后三位
        int busiLenth = busi.length();
        String noPre = null;
        if (busiLenth >= 3) {
            noPre = busi.substring(busiLenth - 3, busiLenth);
        } else {
            noPre = busi;
        }
        String userNoCode = "APP" + noPre;
        SysSequenceNo sysSequenceNo = new SysSequenceNo();
        sysSequenceNo.setCode(userNoCode);
        sysSequenceNo.setFormat("0000");
        sysSequenceNo.setPrefix(noPre);
        sysSequenceNo.setName("流程号(GGDL)");
        String maxNo = genSequenceNo(sysSequenceNo);
        return noPre + DateUtil.getYMD().get(0).substring(1, 3) + DateUtil.getYMD().get(1) + DateUtil.getYMD().get(2) + maxNo;

    }


    //获得序列号
    public String genSequenceNo(SysSequenceNo inputSys) {
        SysSequenceNo sysSequenceNo = sysSequenceNoMapper.selectByPrimaryKey(inputSys);
        Integer maxNo = new Integer("");
        String outputValue = "";
        String format = "";
        //没有最大值则生成
        if (null == sysSequenceNo) {
            inputSys.setMaxNo(new Integer(0));
            maxNo = 0;
            format = inputSys.getFormat();
            sysSequenceNoMapper.insert(inputSys);
        } else {
            SysSequenceNo updateSys = new SysSequenceNo();
            updateSys.setCode(sysSequenceNo.getCode());
            updateSys.setMaxNo(sysSequenceNo.getMaxNo() + 1);
            maxNo = sysSequenceNo.getMaxNo() + 1;
            format = sysSequenceNo.getFormat();
            sysSequenceNoMapper.updateByPrimaryKey(updateSys);
        }
        if (null != format) {
            DecimalFormat df = new DecimalFormat(format);
            outputValue = df.format(maxNo);
        } else {
            outputValue = maxNo.toString();
        }
        return outputValue;
    }
}
