package com.rayoy.bookcode.chapter7.sample4;

public class FieldResolution {

    public static void main(String[] args) {
        System.out.println(Sub.A);
    }

    interface Interface0 {
        int A = 0;
    }

    interface Interface1 extends Interface0 {
        int A = 1;
    }

    interface Interface2 {
        int A = 2;
    }

    static class Parent implements Interface1 {
        public static int A = 3;
    }

    static class Sub extends Parent implements Interface2 {
        public static int A = 4;
        /**
         * 如果注释掉上面一行
         * Error:(26, 39) java: 对A的引用不明确,
         * com.rayoy.bookcode.chapter7.sample4.FieldResolution.Parent中的变量 A和com.rayoy.bookcode.chapter7.sample4
         * .FieldResolution.Interface2中的变量 A都匹配
         */
    }
}