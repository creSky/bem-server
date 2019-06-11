package com.bem.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateUtil {
    //获取时间 年月日
    public static List<String> getYMD() {
        String[] strNow = new SimpleDateFormat("yyyy-MM-dd").format(new Date()).toString().split("-");
        String year = strNow[0];
        String month = strNow[1];
        String day = strNow[2];
        List<String> returnList = new ArrayList<>();
        returnList.add(year);
        returnList.add(month);
        returnList.add(day);
        return returnList;
    }

}
