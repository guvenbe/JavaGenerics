package com.basicstrong.generics;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Subtyping {
    public static void main(String[] args) {
        Object o = new Object();
        Integer i = Integer.valueOf(1);
        o=i;

        List<Number> list = new ArrayList<>();
        list.add(Integer.valueOf(10));
        list.add(Double.valueOf(10.3));
        List<Box<Integer>> bList = new ArrayList<>();
        bList.add(new Box<>(List.of(1,2,4)));
        bList.add(new SquareBox<>(List.of(8,4,5)));
        //List<Number> l1= new ArrayList<Integer>();  will not work
        List<Integer> l1 = new ArrayList<Integer>();
    }
}
//wILL NOT WORK
//class Demo2<T>{
//    private T[] arr = new T[100];
//}