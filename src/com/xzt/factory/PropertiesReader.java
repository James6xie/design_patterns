package com.xzt.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author: zhongtianemail@gmail.com
 * @create 2017-12-01 下午10:46
 * @Description:配置文件读取类
 **/
public class PropertiesReader {

    public Map<String,String> getProperties(){
        Properties props = new Properties();
        Map<String,String> map = new HashMap<String, String>();

        try {
            InputStream inputStream = getClass().getResourceAsStream("type.properties");
            props.load(inputStream);
            Enumeration enumeration = props.propertyNames();
            while (enumeration.hasMoreElements()){
                String key = (String) enumeration.nextElement();
                String property = props.getProperty(key);
                map.put(key,property);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
