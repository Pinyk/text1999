package com.one;

public class GenericClass<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        GenericClass<String> type = new GenericClass <>();
        type.setItem("panck");
        System.out.println(type.getItem());

        GenericClass typ = new GenericClass();    //不定义可以使用任意类型
        typ.setItem("sada");
        typ.setItem(1);
        System.out.println(typ.getItem());
        System.out.println(typ.getItem());
    }
}
