package com.demo.factory.simple;

/**
 * Created by lshuang on 2020/12/8.
 */
public class Main {
    public static void main(String[] args) {
        Moveable m1 = new Plane();
        m1.go();

        Moveable m2 = new Car();
        m2.go();

        SimpleVehicleFactory factory = new SimpleVehicleFactory();
        Car car = factory.createCar();
        car.go();

        Moveable m3 = new CarFactory().create();
        m3.go();
    }
}
