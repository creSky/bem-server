package com.bem.bemEnum;

/**
 * @author ：zjd
 * @date ：Created in 2019/2/26 11:20
 * @modified By： id  流程id 是否归档同步档案
 * 业务类别关联启动流程类型
 */
public enum BemEnum {
    BemEnum0("1","HighVoltageNewV1",1),
    BemEnum1("2","LowVoltageNewZJV1",1),
    BemEnum2("3","LowVoltageNewGSV1",1),
    BemEnum3("4","ChangeInformation",1),
    BemEnum4("5","ChangeType",1),
    BemEnum5("6","ChangeCapacity",1),
    BemEnum6("7","ChangeMeterInfo",1),
    BemEnum7("8","CancelAccount",0),
    BemEnum8("9","ChangePriceType",0),
    BemEnum9("10","PowerRecall",0),
    BemEnum10("11","MoneyRecall",0),
    BemEnum11("12","RefundPreChargeMoney",0),
    BemEnum12("13","BulkRefundMoney",0);


    // 防止字段值被修改，增加的字段也统一final表示常量
    private final String key;
    private final String value;
    private final Integer isBuild;

    private BemEnum(String key, String value,Integer isBuild) {
        this.key = key;
        this.value = value;
        this.isBuild = isBuild;
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

    public Integer getIsBuild() {
        return isBuild;
    }

}
