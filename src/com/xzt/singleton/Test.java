package com.xzt.singleton;

/**
 * @author: zhongtianemail@gmail.com
 * @create 2017-11-28 下午5:17
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {

        //恶汉模式测试
        SingletonHungry singletonHungry1 = SingletonHungry.getInstance();
        SingletonHungry singletonHungry2 = SingletonHungry.getInstance();
        if(singletonHungry1 == singletonHungry2){
            System.out.println("Yes:s1和s2是同一个实例");
        }else {
            System.out.println("NO：s1和s2不是同一个实例");
        }


        //懒汉模式测试
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        if(singletonLazy1 == singletonLazy2){
            System.out.println("Yes:是同一个实例");
        }else {
            System.out.println("NO:不是同一个实例");
        }
    }
}
