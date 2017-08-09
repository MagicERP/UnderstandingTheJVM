package com.rayoy.bookcode.chapter7.sample6;


public class Parent {

    /**
     * 静态变量和静态块 谁在前面谁先执行.
     */
    static {
        A = 2;
    }
    public static int A = 1;
    static class Sub extends Parent {
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Sub.B);
    }

}


