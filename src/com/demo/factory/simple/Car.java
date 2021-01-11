package com.demo.factory.simple;

/**
 * Created by lshuang on 2020/12/8.
 */
public class Car implements Moveable {
    @Override
    public void go() {
        System.out.println("this is an car, go go go ...");
    }
}
