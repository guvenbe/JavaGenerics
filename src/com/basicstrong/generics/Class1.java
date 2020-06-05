package com.basicstrong.generics;

//None generic class to implement a generic interface must speficy wrapper class
//public class Class1 implements Iinterface<T> will not work
interface Iinterface<T>{}
interface Iinterface2{}

class Class2<T> implements Iinterface<T>{}

public class Class1<T> extends Class2<T> implements Iinterface<T> {
}
