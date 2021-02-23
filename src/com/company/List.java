package com.company;

public class List {
    private int data;
    private List next = null;
    private int count;

    public int getData() {
        return this.data;
    }

    public int getCount() {
        return count;
    }

    public List getNext() {
        return this.next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(List next) {
        this.next = next;
    }

    public List() {
        setData(0);
        next = null;
        count = 1;
    }

    public List(int data) {
        setData(data);
        count = 1;
    }

    public List(int data, List next) {
        setData(data);
        setNext(next);
        count = 1;
    }

    public void Add(int data) {
        List l = new List(this.getData(), this.getNext());
        setData(data);
        setNext(l);
        count++;
    }

    public void Delete() {
        if (this.getCount() == 1) {
            setData(0);
            setNext(null);
            count = 0;
            return;
        }
        if (this.getCount() == 0) {
            return;
        }
        List l = this.getNext();
        setData(l.getData());
        setNext(l.getNext());
        count--;
    }

}
