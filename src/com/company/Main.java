package com.company;

public class Main {

    public static void main(String[] args) {
        List l = new List(3);
        l.AddToBegin(2);
        l.AddToBegin(1);
        l.AddToBegin(0);
        while (l!=null) {
            System.out.println(l.getData());
            l = l.getNext();
        }
    }
}
