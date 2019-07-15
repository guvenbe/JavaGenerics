package com.bora.generics;

class GenericMethod {

    public <T> void showArray(T[] array){
        for(T item: array){
            System.out.print(item.toString() + " -> ");
        }
    }

    public <T> T showItem(T t){
        System.out.println("The item is:" + t.toString());
        return t;
    }

}

public class AppGenericMethod {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        System.out.println(genericMethod.showItem("Hell world"));

        Integer[] integersArray = {3,4,5,2,1};
        genericMethod.showArray(integersArray);

        String[] stringArray ={"Bora","Loves", "Brittney", "Leyla" , "Dilara"};
        genericMethod.showArray(stringArray);
    }

}
