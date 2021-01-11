package com.demo.singleton;

/**
 * Created by lshuang on 2020/12/8.
 *
 * 单例模式：饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐！
 * 唯一的缺点：不管使不使用，类加载就会实例化
 */
public class HungerSingleton {

    private static final HungerSingleton INSTANCE = new HungerSingleton();

    private HungerSingleton(){}

    public static HungerSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        HungerSingleton hungerSingleton = HungerSingleton.getInstance();
        HungerSingleton hungerSingleton1 = HungerSingleton.getInstance();
        System.out.println(hungerSingleton == hungerSingleton1);
    }
}
