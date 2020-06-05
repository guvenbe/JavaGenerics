package com.basicstrong.generics;

public class GenericMethod {
    private static <T> String concat(T data){
        return "Data is : " + data;
    }

    public static void main(String[] args) {
        System.out.println(concat("BasicStrong"));
        System.out.println(concat(43));
    }
}
