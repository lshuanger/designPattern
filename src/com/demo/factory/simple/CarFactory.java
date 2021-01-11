package com.demo.factory.simple;

/**
 * Created by lshuang on 2020/12/8.
 */
public class CarFactory {
    public Moveable create() {
        return new Car();
    }
}
