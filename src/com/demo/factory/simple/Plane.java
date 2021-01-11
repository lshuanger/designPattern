package com.demo.factory.simple;

/**
 * Created by lshuang on 2020/12/8.
 */
public class Plane implements Moveable {
    @Override
    public void go() {
        System.out.println("this is plane, fly fly fly...");
    }
}
