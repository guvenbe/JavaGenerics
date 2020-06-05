package com.basicstrong.generics;

public class Demo {
    public static void main(String[] args) {
        Data<String> d1 = new Data<>("This us D1");
        System.out.println("data is : " +d1.toString());

        Data<Integer> d2 = new Data<>(10);
        int data = d2.getData();
        System.out.println(d2.toString());

        IData<String> d3 = new Data<>("We have implemented a generic interface");
        System.out.println(d3.toString());

        //generic Type : generic class or generic Interface

        //Subclassing
        Data<String> d4 = new Data<>("data 4");
        BaseData<String> b4=d4;

    }

}
