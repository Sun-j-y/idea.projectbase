package com.sforits.androidbaseedu.book.example._06._07;

import java.util.ArrayList;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/23-13:08 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    /*
     * Lambda foreach遍历集合
     * */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);
        list.forEach(n -> System.out.println(n));
        list.forEach(System.out::print);
    }
}