package com.sforits.androidbaseedu.book._06._04;

import java.util.ArrayList;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/23-13:08 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    /*
    * foreach遍历集合
    * */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        for (Object next : list) {
            System.out.println(next);
        }
    }
}