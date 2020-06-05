package com.basicstrong.generics;

import java.util.ArrayList;

public class Behaviour {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Basic");
        l.add("strong");
        method(l);
        System.out.println(l);


    }

    public static void method(ArrayList l){   //Raw type argument
         l.add(1);
         l.add("see this");
         l.add(true);
    }
}
