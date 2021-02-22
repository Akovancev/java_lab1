package com.company;

public class List {
    private int data;
    private List next = null;

    public int getData() {
        return this.data;
    }

    public List getNext() {
        return this.next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List() {
        data = 0;
        next = null;
    }

    public List(int data) {
        this.data = data;
    }

    public List(int data, List next) {
        this.data = data;
        this.next = next;
    }

    public void AddToBegin(int data) {
        List l = new List(this.data, this.next);
        this.data = data;
        this.next = l;
    }
}
