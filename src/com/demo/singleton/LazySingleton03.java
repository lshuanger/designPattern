package com.demo.singleton;

/**
 * Created by lshuang on 2020/12/8.
 *
 * 单例模式：饿汉式
 *
 * 枚举写法
 * 不仅线程安全，还可以防止反序列化
 */
public enum LazySingleton03 {

    INSTANCE;

    public void haha(){
        System.out.println("hahhahah------------");
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
            new Thread(()->{
                System.out.println(LazySingleton03.INSTANCE.hashCode());
            }).start();
        }

        LazySingleton03 instance = LazySingleton03.INSTANCE;
        instance.haha();
    }
}
