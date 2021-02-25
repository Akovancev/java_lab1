package com.company;

/**
 * Класс односвязного списка
 * @author Павел Акованцев
 */
public class List {
    /** Поле элемент списка */
    private int data;
    /** Поле ссылка на следующий элемент списка */
    private List next = null;
    /** Поле количество элементов с списке */
    private int count;

    /**
     * Функция получения значения поля
     * @return возвращает значение элемента списка
     */
    public int getData() { return this.data; }

    /**
     * Процедура определения значения элемента списка
     * @param data - значение элемента
     */
    public void setData(int data) { this.data = data; }

    /**
     * Функция получения значения поля
     * @return возвращает количество элементов в списке
     */
    public int getCount() { return count; }

    /**
     * Процедура определения количества элементов
     * @param count - количество элементов в списке
     */
    private void setCount(int count) { this.count = count; }

    /**
     * Функция получения значения поля
     * @return возвращает следующий элемент списка
     */
    public List getNext() { return this.next; }

    /**
     * Процедура определения количества элементов
     * @param next - элемент списка
     */
    public void setNext(List next) { this.next = next; }

    /**
     * Конструктор по умолчанию
     */
    public List() {
        setData(-1);
        setCount(0);
    }

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param data - значение элемента
     */
    public List(int data) {
        setData(data);
        setCount(1);
    }

    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param data - значение элемента
     * @param next - следующий элемент списка
     */
    public List(int data, List next) {
        setData(data);
        setNext(next);
        setCount(1);
    }

    /**
     * Функция добавления элемента в список
     * @param data - значение нового элемента
     */
    public void Add(int data) {
        if (this.getCount() == 0)
            this.setData(data);
        List l = new List(this.getData(), this.getNext());
        this.setData(data);
        this.setNext(l);
        this.setCount(this.getCount() + 1);
    }

    /**
     * Функция удаления элемента из списка
     */
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

    /**
     * Функция извлечения элемента из списка
     * @param num - порядковый номер извлекаемого элемента
     */
    public int get(int num) {
        if (num > this.getCount())
            return -1;
        List l = new List(this.getData(), this.getNext());
        for (int i = 1; i < num; i++)
            l = l.getNext();
        return l.getData();
    }
}
