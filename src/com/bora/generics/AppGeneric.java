package com.bora.generics;
//Sample without Generics

class Store2<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "" + this.item.toString();
    }
}

class Hashtable<K,V>{
    private K key;
    private V value;

    public Hashtable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Hashtable{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class AppGeneric {
    public static void main(String[] args) {
//        Raw type avoid it!!!
//        Store store = new Store();
//        store.setItem("Hello World");
//        System.out.println(store);
//
//        store.setItem("45");
//        System.out.println(store);

        //This does not work without casting - code smell
//        Integer item = (Integer) store.getItem();

        Store2<String> stringStore = new Store2<>();
        stringStore.setItem("Hello World!!");
        System.out.println(stringStore);

        Store2<Integer> integerStore = new Store2<>();
        integerStore.setItem(45);
        System.out.println(integerStore);
        //No casting
        Integer intNum = integerStore.getItem();

        Hashtable<String, Integer> hashtable = new Hashtable<>("Hello World", 55);
        System.out.println(hashtable);

    }
}
