package com.demo.strategy;

/**
 * Created by lshuang on 2020/12/8.
 */
public class Cat {
    int weight,height;

    public Cat(int weight,int height){
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat cat){
        if (this.weight < cat.weight){
            return -1;
        }else if(this.weight > cat.weight){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
