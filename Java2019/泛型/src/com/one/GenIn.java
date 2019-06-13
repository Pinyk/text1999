package com.one;

public class GenIn {
    public static void main(String[] args) {
        String str = "abcd";
        Object obj;
        obj = str;
        System.out.println(obj);

        MyClass<String> myclass1 = new MyClass <>();
        MyClass<Object> myclass2 = new MyClass <>();
        //myclass1 = myclass2;    类型不一无法直接赋值
        obj = myclass1;
        System.out.println(obj);

    }

    public static class MyClass<I>{

    }

}
