package org.example;

public class Queue extends List{
    public Queue(){
        super();
    }

    public void enqueue(int value){
        super.add(0,value);
    }
    public void dequeue(){
        super.remove(arraylist.size() - 1);
    }
    public void showqueue(){
        int size = arraylist.size();
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arraylist.get(i) + " ");
        }
        System.out.println();
    }
}
