package com.basicstrong.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class WildCardDemo {
    public static  void  displayData(List<?> l){
        for (Object t: l) {
            System.out.println(t);
        }

    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5);
        displayData(list);
    }
}
