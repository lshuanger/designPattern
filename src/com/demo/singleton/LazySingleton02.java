package com.demo.singleton;

/**
 * Created by lshuang on 2020/12/8.
 *
 * 单例模式：懒汉式
 *
 * 静态内部类
 * 加载外部类时不会加载内部类，可以实现懒加载
 * JVM保证线程安全
 */
public class LazySingleton02 {

    private LazySingleton02(){};

    private static class LazySingleton02Inner{
        private final static LazySingleton02 INSTANCE = new LazySingleton02();
    }

    public static LazySingleton02 getInstance(){
        return LazySingleton02Inner.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()->{
                System.out.println(LazySingleton01.getInstance().hashCode());
            }).start();
        }
    }
}
