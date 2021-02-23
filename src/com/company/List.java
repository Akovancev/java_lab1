package com.company;

public class List {
    private int data;
    private List next = null;
    private int count;

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getCount() { return count; }

    private void setCount(int count) { this.count = count; }

    public List getNext() {
        return this.next;
    }

    public void setNext(List next) {
        this.next = next;
    }

    public List() {
        setData(-1);
        setCount(0);
    }

    public List(int data) {
        setData(data);
        setCount(1);
    }

    public List(int data, List next) {
        setData(data);
        setNext(next);
        setCount(1);
    }

    public void Add(int data) {
        if (this.getCount() == 0)
            this.setData(data);
        List l = new List(this.getData(), this.getNext());
        this.setData(data);
        this.setNext(l);
        this.setCount(this.getCount() + 1);
    }

    public void Delete() {
        if (this.getCount() == 1) {
            this.setData(-1);
            this.setNext(null);
            this.setCount(0);
            return;
        }
        if (this.getCount() == 0)
            return;
        List l = this.getNext();
        this.setData(l.getData());
        this.setNext(l.getNext());
        this.setCount(this.getCount() - 1);
    }

    public int get(int num) {
        if (num > this.getCount())
            return -1;
        List l = new List(this.getData(), this.getNext());
        for (int i = 1; i < num; i++)
            l = l.getNext();
        return l.getData();
    }
}
