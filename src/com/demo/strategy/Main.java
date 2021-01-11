package com.demo.strategy;

import java.util.Arrays;

/**
 * Created by lshuang on 2020/12/8.
 *
 * 策略模式
 */
public class Main {

    public static void main(String[] args) {
        Cat[] cat = {new Cat(3,3),new Cat(1,2),new Cat(6,1)};
        Sorter sorter = new Sorter();
        sorter.sort(cat,new CatDefaultComparator()); // 采用默认排序策略（按weight升序）
        System.out.println(Arrays.toString(cat));

        sorter.sort(cat,new CatHeightComparator()); // 采用按高度排序策略（按height降序）
        System.out.println(Arrays.toString(cat));

    }
}
