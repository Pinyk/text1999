package com.one;

public class GeneMethod {//方法泛型定义在返回值前
    private static<T> boolean isEqual(GenericClass<T> g1,GenericClass<T> g2){
        return g1.getItem().equals(g2.getItem());
    }

    private static <T extends Comparable<T>> int compere(T t1,T t2){
        return t1.compareTo(t2);//T类型实现了Comparble的功能  泛型子类
    }

    public static void main(String[] args) {
        GenericClass<String> g1 = new GenericClass <>();
        g1.setItem("xian");

        GenericClass<String> g2 = new GenericClass <>();
        g2.setItem("xian");


        boolean isEqual = isEqual(g1,g2);
        System.out.println(isEqual);

        System.out.println(compere(2,4));
    }
}