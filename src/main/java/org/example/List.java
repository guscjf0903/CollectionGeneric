package org.example;

import java.util.ArrayList;

public class List {
    protected static final int DEFAULT_NUM = 10;
    static public ArrayList<Integer> arraylist;


    public List() {
        this.arraylist = new ArrayList<>(DEFAULT_NUM);
    }
    public void add(int value) { // 추가
        arraylist.add(value);
    }
    public void add(int idx, int value) { // 중간에 추가
        if (idx > arraylist.size() || idx < 0){
            throw new IndexOutOfBoundsException();
        }
        arraylist.add(idx, value);
    }

    public void remove(int idx) {
        if (idx > arraylist.size() || idx < 0){
            throw new IndexOutOfBoundsException();
        }
        arraylist.remove(idx);
    }

    public void clear() {
        arraylist.clear();
    }

    public void valremove(int value) {
        int idx = arraylist.indexOf(value);
        remove(idx);
    }

    public int get(int idx) {
        if (idx >= arraylist.size() || idx < 0){
            throw new IndexOutOfBoundsException();
        }
        return arraylist.get(idx);
    }

    public void set(int idx, int value) {
        if (idx >= arraylist.size() || idx < 0){
            throw new IndexOutOfBoundsException();
        }
        arraylist.set(idx, value);
    }

    public int indexOf(int value) {
        return arraylist.indexOf(value);
    }

    public boolean contains(int value) {
        return arraylist.contains(value);
    }

    public int size() {
        return arraylist.size();
    }

    public void showarr() {
        int size = arraylist.size();
        for (int i = 0; i < size; i++) {
            System.out.print(arraylist.get(i) + " ");
        }
        System.out.println();
    }

}
