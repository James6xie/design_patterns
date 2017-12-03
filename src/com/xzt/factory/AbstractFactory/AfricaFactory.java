package com.xzt.factory.AbstractFactory;

/**
 * @author: zhongtianemail@gmail.com
 * @create 2017-12-02 下午3:33
 * @Description:工厂类生产boy和girl
 **/
public class AfricaFactory implements PersonFactory{
    @Override
    public Boy getBoy() {
        return new AfricaBoy();
    }

    @Override
    public Girl getGirl() {
        return new AfricaGirl();
    }
}
