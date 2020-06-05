package com.basicstrong.generics;

class TypeErasure<T> {
    T obj;

    TypeErasure(T obj) {
        this.obj = obj;
    }

    void showType() {
        System.out.print(obj.getClass());
    }
}

class TypeErasureDemo {
    public static void main(String args[]) {
        TypeErasure<String> strObject = new TypeErasure<String>("BasicsStrong");
        System.out.println(strObject.getClass().getName());
        strObject.showType();
    }
}