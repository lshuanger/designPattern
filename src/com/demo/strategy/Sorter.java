package com.demo.strategy;

import java.util.Comparator;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lshuang on 2020/12/8.
 */
public class Sorter<T> {

    public void sort(T[] t, Comparator<T> comparator){
        for (int i = 0; i < t.length; i++) {
            int minPos = i;

            for (int j = i+1; j < t.length; j++) {
                minPos = comparator.compare(t[j],t[minPos]) == -1 ? j:minPos;
            }

            swap(t,i,minPos);
        }
        ReentrantLock reentrantLock = new ReentrantLock(true);
    }

    void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    public static void sort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int minPos = i;
//
//            for (int j = i+1; j < arr.length; j++) {
//                minPos = arr[j] < arr[minPos] ? j:minPos;
//            }
//
//            swap(arr,i,minPos);
//        }
//    }
//
//    static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

//    public static void main(String[] args) {
//        int[] arr = {2,5,3,9,10,0};
//        sort(arr);
//        for (int i : arr) {
//            System.out.println(i);
//        }
//    }
}
