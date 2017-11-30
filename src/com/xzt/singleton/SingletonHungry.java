package com.xzt.singleton;

/**
 * @author: zhongtianemail@gmail.com
 * @create 2017-11-28 下午5:09
 * @Description:单例模式Singleton
 * 应用场合：有些对象只需要一个就够了，如媳妇
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型包括：懒汉式、恶汉式
 * 实现：恶汉式
 **/
public class SingletonHungry {
    //1.构造方法私有化
    private SingletonHungry() {
    }

    //2.创建类的唯一实例(提供给外部static),安全期间了类的成员变量需要private
    //（在类加载的时候就创建此实例）恶汉式
    private static SingletonHungry instance = new SingletonHungry();

    //3.提供一个获取实例的方法,并将方法static,
    public static SingletonHungry getInstance(){
        return instance;
    }
}
