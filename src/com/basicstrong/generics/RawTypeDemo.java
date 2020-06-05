package com.basicstrong.generics;

import java.util.List;

public class RawTypeDemo {
    public static void main(String[] args) {
        Box<Integer> genBox = new Box<>(List.of(1,2,3));

        for (Integer integer: genBox.getA()) {
            System.out.println(integer);
        }
        //Raw type not type safe

        Box rawBox = new Box(List.of(1,2,3, "basic strong"));

        for(Object o : rawBox.getA()){
            System.out.println(o);

        }


    }
}
