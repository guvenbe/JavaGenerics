package com.basicstrong.generics;

import java.util.Arrays;
import java.util.List;

public class BoundedT {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[] {2,5,8,9});
        List<Long> llist = Arrays.asList(new Long[] {2L,5L,8L,9L});
        List<Double> dlist = Arrays.asList(new Double[] {2.5,5.5,8.1,9.0,9.9});

        //List<String> slist = Arrays.asList(new String[] {"hello", "there", "BasicStrong"});
        DataSorter<Integer> sorter1 = new DataSorter<>(list);
        DataSorter<Long> sorter3 = new DataSorter<>(llist);
        DataSorter<Double> sorter4 = new DataSorter<>(dlist);
        //DataSorter<String> sorter2 = new DataSorter<>(slist);
        sorter1.getSortedData();
        //sorter2.getSortedData();
        sorter3.getSortedData();
        sorter4.getSortedData();
        getSortedData(llist);

        IBound1 b = new CBound();
        getSortedData2(b);

        CBound2 c = new CBound2();
        getSortedData3(c);
    }

    public static <T extends Number> void getSortedData(List<T> list){
        list.sort(null);
        for (T t : list){
            System.out.println(t);
        }
    }
    //Interface can be used bound to interface
    public static <T extends IBound1> void getSortedData2(T list){

    }
    //Multiple Interface can be used to bound
    public static <T extends IBound1 & IBound2> void getSortedData3(T list){

    }

}
interface IBound1{}
interface IBound2{}

class CBound implements IBound1{}

class CBound2 implements IBound1 , IBound2{}