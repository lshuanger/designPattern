package com.demo.singleton;

/**
 * Created by lshuang on 2020/12/8.
 *
 * 单例模式：饿汉式
 * 双重校验锁
 */
public class LazySingleton01 {

    // 使用volatile关键字，以防JVM指令重排优化，导致getInstance获取到空的实例
    private static volatile LazySingleton01 INSTANCE;

    private LazySingleton01(){

    };

    // 双重检查，解决线程不安全问题
    public static LazySingleton01 getInstance(){
        if(INSTANCE == null){
            synchronized (LazySingleton01.class){
                if(INSTANCE == null){
                    INSTANCE = new LazySingleton01();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i=0; i<100; i++){
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(LazySingleton01.getInstance().hashCode());
//                }
//            }).start();

            // 当类只有一个抽象方法时，可以使用这种lambda表达式写法
            new Thread(()->{
                System.out.println(LazySingleton01.getInstance().hashCode());
            }).start();
        }

    }

}
