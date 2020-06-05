package com.basicstrong.generics.linkedlist;

class DataNode<T> {
    T data;
    DataNode next;

    public DataNode(T data) {
        this.data = data;
    }
}

class LinkedListDemo<T> {

    DataNode head = null, tail = null;

    public LinkedListDemo(DataNode head, DataNode tail) {
        this.head = head;
        this.tail = tail;
    }

    public static void main(String args[]) {
        LinkedListDemo<java.io.Serializable> linkedListDemo = new LinkedListDemo<java.io.Serializable>(null, null);
        linkedListDemo.addNode(10);
        linkedListDemo.addNode("hello");
        linkedListDemo.addNode(123.6);

        linkedListDemo.printLinkedList();
    }

    public void addNode(T val) {
        if (head == null) {
            DataNode temp = new DataNode(val);
            head = temp;
            tail = temp;
        } else {
            tail.next = new DataNode(val);
            tail = tail.next;
        }
    }

    public void printLinkedList() {
        System.out.println();
        DataNode temp = head;
        while (temp != null) {
            System.out.println(" " + temp.data);
            temp = temp.next;
        }
    }

}
