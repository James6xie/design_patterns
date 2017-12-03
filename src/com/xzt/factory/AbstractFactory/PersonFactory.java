package com.xzt.factory.AbstractFactory;

/**
 * @author: zhongtianemail@gmail.com
 * @create 2017-12-02 下午3:26
 * @Description:提供一个接口
 **/
public interface PersonFactory {

    public  Boy getBoy();
    public Girl getGirl();
}
