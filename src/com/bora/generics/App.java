package com.bora.generics;
//Sample without Generics

class Store {
    private Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "" + this.item.toString();
    }
}

public class App {
    public static void main(String[] args) {
        Store store = new Store();
        store.setItem("Hello World");
        System.out.println(store);

        store.setItem("45");
        System.out.println(store);

        //This does not work without casting - code smell
        Integer item = (Integer) store.getItem();

    }
}
