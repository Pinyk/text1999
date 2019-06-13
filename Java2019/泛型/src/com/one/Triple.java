package com.one;

public class Triple<T extends Number & Comparable<T>> {//泛型子类
    private T value1;
    private T value2;
    private T value3;

    public Triple(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }

    public T getValue3() {
        return value3;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }

    public void setValue3(T value3) {
        this.value3 = value3;
    }

    private T addValues(){
        Number v = value1.doubleValue() + value2.doubleValue() + value3.doubleValue();
        return (T)v;
    }

    public T largest(){
        T res = value1;
        if(value2.compareTo(res) > 0){
            res = value2;
        }
        if(value3.compareTo(res) > 0){
            res = value3;
        }
        return res;
    }

    public static void main(String[] args) {
        Triple <Integer> t = new Triple <>(1, 3, 2);
        System.out.println(t.addValues());
        System.out.println(t.largest());
        t.setValue3(6);
        System.out.println(t.largest());
    }
}








