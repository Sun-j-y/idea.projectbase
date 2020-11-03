package com.sforits.androidbaseedu.book._05._10;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/21-13:42 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("start: " + start);

        for (int i = 0; i < 1000000000; i++) {
            new Integer("1");
        }
        long end = System.currentTimeMillis();

        System.out.println("end: " + end);
        System.out.println("程序运行时间: " + (end - start) + "毫秒");

    }
}