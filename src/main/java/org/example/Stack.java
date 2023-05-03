package org.example;

public class Stack extends List {
    int top;
    int size;
    public Stack() {
        super();
        this.size = 0;
        this.top = 0;
    }

    public void push(int value) {
        super.add(size,value);
        size++;
    }

    public void pop() {
        super.remove(size - 1);
        size--;
    }

    public int peek() {
        if (0 > arraylist.size() - 1){
            throw new IndexOutOfBoundsException();
        }
        return arraylist.get(size - 1);
    }

    public void showStack() {
        super.showarr();
    }

}
