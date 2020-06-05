package com.basicstrong.generics;

import java.util.List;

public class Box<T> {

    public Box(List<T> a) {
        this.a = a;
    }

    public List<T> getA() {
        return a;
    }

    public void setA(List<T> a) {
        this.a = a;
    }

    private List<T> a;
}
