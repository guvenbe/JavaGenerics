package com.basicstrong.generics;

import org.w3c.dom.ls.LSOutput;

public class LinkedListDemo {

    public static void main(String[] args) {

        DataNode<Integer> node2 = new DataNode<Integer>(20, null);
        DataNode<Integer> node1 = new DataNode<Integer>(35,node2);

        DataNode<Double> node22 = new DataNode<>(20.9, null);
        DataNode<Double> node11 = new DataNode<>(35.8,node22);

        //The wild card ? in DataNode allows node to be assigned Number to Integer
        DataNode<Number> node111 = new DataNode<>(Double.valueOf(35.8),node1);

        //DataNode(Integer, DataNode(Integer))
        System.out.println(node1.toString());
    }


}
