package com.bem.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class PropertiesUtil {
    private static Properties _prop = new Properties();

    /**
     * 读取配置文件
     * @param name
     */
    public static String getValue(String name){
        try {
            InputStream in = PropertiesUtil.class.getResourceAsStream("/param.properties");
            BufferedReader bf = new BufferedReader(new InputStreamReader(in));
            _prop.load(bf);
        }catch (IOException e){
            e.printStackTrace();
        }
        return _prop.getProperty(name);
    }

}
