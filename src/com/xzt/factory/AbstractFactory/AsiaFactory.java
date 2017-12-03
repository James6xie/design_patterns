package com.xzt.factory.AbstractFactory;

/**
 * @author: zhongtianemail@gmail.com
 * @create 2017-12-02 下午3:29
 * @Description:工厂类生产Boy和Girl
 **/
public class AsiaFactory implements PersonFactory{

    @Override
    public Boy getBoy() {
        return new AsiaBoy();
    }

    @Override
    public Girl getGirl() {
        return new AsiaGirl();
    }
}
