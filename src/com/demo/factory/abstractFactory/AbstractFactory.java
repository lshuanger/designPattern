package com.demo.factory.abstractFactory;

/**
 * Created by lshuang on 2020/12/8.
 *
 * 定义产品族
 */
public abstract class AbstractFactory {

    abstract AbstractFood createFood();

    abstract AbstractVehicle createVehicle();

    abstract AbstractWeapon createWeapon();

}
