package com.bem.bemEnum;

/**
 * @author ：zjd
 * @date ：Created in 2019/2/26 11:20
 * @modified By：
 * 业务类别关联启动流程类型
 */
public enum BemEnum {
    BemEnum0("1","HighVoltageNewV1"),
    BemEnum1("2","LowVoltageNewZJV1"),
    BemEnum2("3","LowVoltageNewGSV1"),
    BemEnum3("3","ChangeInformation"),
    BemEnum4("4","ChangeType"),
    BemEnum5("5","HighVoltageAddCapacity"),
    BemEnum6("6","ChangeMeterInfo"),
    BemEnum7("7","CancelAccount");



    // 防止字段值被修改，增加的字段也统一final表示常量
    private final String key;
    private final String value;


    private BemEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    // 根据key获取枚举
    public static BemEnum getEnumByKey(String key) {
        if (null == key) {
            return null;
        }
        for (BemEnum temp : BemEnum.values()) {
            if (temp.getKey().equals(key)) {
                return temp;
            }
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}
