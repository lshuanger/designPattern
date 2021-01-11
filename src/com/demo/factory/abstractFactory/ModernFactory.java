package com.demo.factory.abstractFactory;

/**
 * Created by lshuang on 2020/12/8.
 */
public class ModernFactory extends AbstractFactory {
    @Override
    AbstractFood createFood() {
        return new Bread();
    }

    @Override
    AbstractVehicle createVehicle() {
        return new BubbleCar();
    }

    @Override
    AbstractWeapon createWeapon() {
        return new AK47();
    }
}
