package com.xzt.singleton;

/**
 * @author: zhongtianemail@gmail.com
 * @create 2017-11-28 下午10:10
 * @Description:
 **/
public class SingletonLazy {

    //1.私有化类的构造方法
    private  SingletonLazy(){

    }

    //2.创建类的唯一实例,实例没有初始化；（懒汉）
    private static SingletonLazy instance;

    //3.提供一个获取实例的方法,并将方法static；
    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
