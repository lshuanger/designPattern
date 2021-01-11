package com.demo.factory.abstractFactory;

/**
 * Created by lshuang on 2020/12/8.
 */
public class Main {
    public static void main(String[] args) {
//        BubbleCar bubbleCar = new BubbleCar();
//        bubbleCar.go();
//        Bread bread = new Bread();
//        bread.foodName();
//        AK47 ak47 = new AK47();
//        ak47.shoot();

        AbstractFactory factory = new ModernFactory(); // 现代类的工厂
        AbstractFood food = factory.createFood();
        food.foodName();
        AbstractVehicle vehicle = factory.createVehicle();
        vehicle.go();
        AbstractWeapon weapon = factory.createWeapon();
        weapon.shoot();
        System.out.println("-------------------------------");

        AbstractFactory factory1 = new AncientFactory(); // 古代类的工厂
        AbstractFood food1 = factory1.createFood();
        food1.foodName();
        AbstractVehicle vehicle1 = factory1.createVehicle();
        vehicle1.go();
        AbstractWeapon weapon1 = factory1.createWeapon();
        weapon1.shoot();
    }
}
