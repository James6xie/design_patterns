package com.xzt.factory;

import java.util.Map;

/**
 * @author: zhongtianemail@gmail.com
 * @create 2017-11-30 下午10:34
 * @Description:发型工厂
 **/
public class StyleFactory {
    public HairInterface getHairStyle(String key){
        if("left".equals(key)){
            return new LeftStyle();
        }else if("right".equals(key)){
            return new RightStyle();
        }
        return null;
    }
    /**
     * @author:zhongtianemail@gmail.com.cn
     * @Description:根据类的名称生产对象
     * @Param:
     * @Return:
     * @Date:   下午10:44 17-11-30
     */
    public HairInterface getHairByClass(String className){
        try {
            //加载对应关系
            Map<String,String> map = new PropertiesReader().getProperties();

            HairInterface hairInterface = (HairInterface) Class.forName(map.get(className)).newInstance();
            return hairInterface;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
