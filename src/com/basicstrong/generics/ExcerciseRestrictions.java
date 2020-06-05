package com.basicstrong.generics;

import java.util.ArrayList;
import java.util.List;

public class ExcerciseRestrictions {
    static <T> void foo(List<? extends T> list1, List<? super T> list2) { }

    public static void main(String[] args) {
        List<Number> numList = new ArrayList<Number>();
        List<Integer> intList = new ArrayList<Integer>();
        foo(intList,numList); //This will work
        // foo(numList,intList); this will not work
    }
}

class Exercise3 {

    public static <T extends Number> List<T> myFun(List<? super T> list) {
        return null;
    }

    public static void main(String[] args) {
        List<Integer> inList = new ArrayList<Integer>();
        List<Integer> outList = myFun(inList);
        //List<Number> outlist2 =myFun(inList) this will not work
    }
}