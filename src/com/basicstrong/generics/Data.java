package com.basicstrong.generics;

//Type parameter
//Belongs only to instance of class. Can not be used for static

class BaseData<T>{}

public class Data<T> extends BaseData<T> implements  IData<T> {
    private T data;

    public Data(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return data;
    }



    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data='" + data + '\'' +
                '}';
    }
}
