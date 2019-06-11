package com.bem.util;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

public class BemCommonUtil {

    /*生成工作单号
      规则:暂定时间戳毫秒
     */
    public static String createAppNo() {
        long time = System.currentTimeMillis();
        return String.valueOf(time);
    }

    /**生成用户号
     * 规则 营业区域（3位）+年月日（190610）
     */
    public static String createUserNo() {
        long time = System.currentTimeMillis();
        return String.valueOf(time);
    }

    /**
     * 操作人id
     */
    public static String getOpeartorId(String userRightJson) {
        JSONObject userRight = JSONObject.parseObject(userRightJson);
        if (null != userRight) {
            return userRight.getString("managerId");
        }
        return null;
    }

    /**
     * 操作人角色
     */
    public static String getOpeartorRoleIds(String userRightJson) {
        JSONObject userRight = JSONObject.parseObject(userRightJson);
        if (null != userRight) {
            return userRight.getString("roleIds");
        }
        return null;
    }

    /**
     * 操作人部门
     */
    public static String getOpeartorDeptIds(String userRightJson) {
        JSONObject userRight = JSONObject.parseObject(userRightJson);
        if (null != userRight) {
            return userRight.getString("deptIds");
        }
        return null;
    }

    /**
     * 将srcJObjStr和addJObjStr合并，如果有重复字段，以addJObjStr为准
     *
     * @param srcJObjStr 原jsonObject字符串
     * @param addJObjStr 需要加入的jsonObject字符串
     * @return srcJObjStr
     */
    public static String combineJson(String srcJObjStr, String addJObjStr) throws JSONException {
        if (addJObjStr == null || addJObjStr.isEmpty()) {
            return srcJObjStr;
        }
        if (srcJObjStr == null || srcJObjStr.isEmpty()) {
            return addJObjStr;
        }
        JSONObject srcJObj = JSONObject.parseObject(srcJObjStr);
        JSONObject addJObj = JSONObject.parseObject(addJObjStr);

        JSONObject ouJObj = new JSONObject();
        ouJObj.putAll(srcJObj);
        ouJObj.putAll(addJObj);
        return ouJObj.toString();
    }


}
