package com.basicstrong.generics;

//  ?             : is unbounded wild card
//  ? extends A   : is upper bounded wild card
//  ? super B     : is lower bounded wild card

public class DataNode<E> {
    private E data;
    private DataNode<? extends Number> next; //any number type

    public DataNode(E data, DataNode<? extends Number> next) {
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public DataNode<? extends Number> getNext() {
        return next;
    }

    public void setNext(DataNode<? extends Number> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DataNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
