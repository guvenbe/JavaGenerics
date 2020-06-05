package com.basicstrong.generics;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private static <T> List<T> arrayToList(T [] arr){
        List<T> arrayList = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            arrayList.add(arr[i]);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        Integer [] arr1 ={1,2,3};
        List<Integer> arrList1 = arrayToList(arr1);
        System.out.println(arrList1);
        String [] arr2 = {"Red", "White", "Blue"};
        List<String> arrList2 = arrayToList(arr2);
        System.out.println(arrList2);
    }
}
