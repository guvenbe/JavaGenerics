package com.basicstrong.generics;

import java.util.List;

public class BoxGenericMethod {

    public <T> BoxGenericMethod(List<T> a) {
        this.a = a;
    }

    public List getA() {
        return a;
    }

    public void setA(List a) {
        this.a = a;
    }

    private List a;
}
