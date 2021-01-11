package com.demo.strategy;

import java.util.Comparator;

/**
 * Created by lshuang on 2020/12/8.
 */
public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.height > o2.height){
            return -1;
        }else if(o1.height < o2.height){
            return 1;
        }else {
            return 0;
        }
    }
}
