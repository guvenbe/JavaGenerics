package com.basicstrong.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class WildCardDemo {
    //unbounded wild card
    public static  void  displayData(List<?> l){
        for (Object t: l) {
            System.out.println(t);
        }

    }
    public static  void  displayData2(List<? super Integer> l){
        for (Object t: l) {
            System.out.println(t);
        }

    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5);
        List<Number> list1 = Arrays.asList(1,2,3,5);
        List<Double> list2 = Arrays.asList(1.0,2.6,3.5,5.0);
        displayData(list);
        displayData2(list1);
        //displayData2(list2); //this will work since integer is not a subtype double
    }
}
