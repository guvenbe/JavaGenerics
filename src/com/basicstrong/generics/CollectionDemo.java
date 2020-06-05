package com.basicstrong.generics;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionDemo {
    public static void main(String[] args) {
//        This will give runtime error
//        ArrayList list = new ArrayList();
//        list.add("John");
//        list.add(1);
//
//        for (Object object: list) {
//            String str = (String) object;
//        }
//    }

        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        //list.add(1);

        for (String object : list) {
            String str =  object;
            System.out.println(str);
        }

        HashMap<Integer, String> map = new HashMap<>();

        Bin<String, Integer> bin = new Bin<>();
        bin.setDryTrash("adrererereere");
        bin.setWetTrash(12347837);
        System.out.println("Dry trash: " + bin.getDryTrash() + " Wet trash: " + bin.getWetTrash());
    }
}
