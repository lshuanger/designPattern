package com.demo.factory.simple;

/**
 * Created by lshuang on 2020/12/8.
 *
 * 简单工厂
 * 可扩展性不好
 */
public class SimpleVehicleFactory {

    public Car createCar(){
        return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
