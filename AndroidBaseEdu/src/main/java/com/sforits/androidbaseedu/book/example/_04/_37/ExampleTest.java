package com.sforits.androidbaseedu.book.example._04._37;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/19-19:47 Created by IntelliJ IDEA.
 */
public class ExampleTest {


    public static void main(String[] args) {
        recyclegWaste();
        System.out.println("------------");
        recyclegWaste2();
    }

    public static void recyclegWaste() {
        Person person = new Person();
        person = null;
        int i = 0;
        System.out.println("方法1循环中...");
        while (i < 100) {
            i++;
        }
    }

    public static void recyclegWaste2() {
        Person person = new Person();
        person = null;
        // 通知垃圾回收器进行强制垃圾回收
        System.gc();
        int i = 0;
        System.out.println("方法2循环中...");
        while (i < 100) {
            i++;
        }
    }
}