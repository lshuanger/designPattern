package com.demo.factory.abstractFactory;

/**
 * Created by lshuang on 2020/12/8.
 */
public class AncientFactory extends AbstractFactory {
    @Override
    AbstractFood createFood() {
        return new Potato();
    }

    @Override
    AbstractVehicle createVehicle() {
        return new CarriageCar();
    }

    @Override
    AbstractWeapon createWeapon() {
        return new Archery();
    }
}
