package com.basicstrong.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ErasureDemo {
     //Runtime error class java.lang.Integer cannot be cast to class java.lang.String
    public static void main(String[] args) {
        //System.out.println(method1(10)); //This will fail
        ArrayList l1 = new ArrayList<String>();
        //ArrayList l1 = new ArrayList;
        ArrayList l2 = new ArrayList<Integer>();

        l1.add(12);
        l1.add(true);
        l1.add("hello");
        System.out.println(l1);
    }

    public static String method1(Integer x) {
        List<String> a = new LinkedList<>();
        //At compile
        //List a = new LinkedList
        List b = a;
        b.add(x);

        return a.iterator().next();
        //return (String) a.iterator().next();
    }

    public static  void method2(ArrayList<String> l){

    }
}
