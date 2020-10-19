package com.sforits.androidbaseedu.book.example._04._18;

public class Example18 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show1();
        outer.tset2();
    }
}

class Outer {
    int outerM = 0;

    // 定义外部类成员方法
    void test1() {
        System.out.println("外部类成员测试方法");
    }

    // 内部类
    class Inner {
        int innerM = 1;

        // 1. 定义内部类方法, 访问外部类成员变量和方法
        void show1() {
            System.out.println("外部类成员变量 outerM = " + outerM);
            // 调用外部类成员方法
            test1();
        }

        void show2() {
            System.out.println("内部类成员方法");

        }
    }

    // 2. 定义外部类成员方法, 访问内部类变量和方法
    void tset2() {
        Inner inner = new Inner();
        System.out.println("内部类成员变量 innerM = " + inner.innerM);
        inner.show2();
    }
}
