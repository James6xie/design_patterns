package com.xzt.factory;

import com.xzt.factory.AbstractFactory.AsiaFactory;
import com.xzt.factory.AbstractFactory.Boy;
import com.xzt.factory.AbstractFactory.PersonFactory;

/**
 * @author: zhongtianemail@gmail.com
 * @create 2017-11-30 下午10:32
 * @Description:
 **/
public class TestStyle {

    public static void main(String[] args) {

        /*
        HairInterface left = new LeftStyle();
        left.draw();
        HairInterface right = new RightStyle();
        right.draw();
        */
        //工厂模式创建
        StyleFactory styleFactory = new StyleFactory();
/*
        //创建左偏分发型
        HairInterface left2 = styleFactory.getHairStyle("left");
        left2.draw();
*/
        /*
        //使用加载类的方式
        HairInterface left3 = styleFactory.getHairByClass("com.xzt.factory.LeftStyle");
        left3.draw();
        */

        //升级加载类的操作(使用定义key的方式在配置文件)
        HairInterface hairInterface = styleFactory.getHairByClass("middle");
        hairInterface.draw();


        //
        PersonFactory factory = new AsiaFactory();
        Boy boy = factory.getBoy();
        boy.drawMan();
    }
}
