package com.basicstrong.generics.linkedlist.stack;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        this.arr = new ArrayList<>();
        this.top = -1;
        this.capacity = size;
    }

    public void push(T x)
    {
        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        top++;
        arr.add(x);
    }

    public T pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + peek());

        // decrease stack size by 1 and (optionally) return the popped element
        return arr.remove(top--);
    }

    public T peek()
    {
        if (!isEmpty())
            return arr.get(top);
        else
            System.exit(1);

        return null;
    }
    // Utility function to return the size of the stack
    public int size()
    {
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public Boolean isEmpty()
    {
        return top == -1;    // or return size() == 0;
    }

    // Utility function to check if the stack is full or not
    public Boolean isFull()
    {
        return top == capacity - 1;    // or return size() == capacity;
    }

    public static void main (String[] args)
    {
        Stack stack = new Stack(3);

        stack.push(1);        // Inserting 1 in the stack
        stack.push(2.5);        // Inserting 2.5 in the stack

        stack.pop();        // removing the top 2.5
        stack.pop();        // removing the top 1

        stack.push(3);        // Inserting 3 in the stack
        stack.push("hello");
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is " + stack.size());

        stack.pop();        // removing the top 3

        // check if stack is empty
        if (stack.isEmpty())
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty. Top element:" + stack.peek());
    }
}
