package com.sforits.androidbaseedu.book.example._06._09;

import java.util.HashSet;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/23-13:08 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    /*
     * Set集合 Collection
     *      HashSet集合
     * */
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();
        set.add("jack");
        set.add("rose");
        set.add("Eve");
        set.add("jack");    // set集合中的元素会以某种规则保证元素的唯一

        // 遍历
        set.forEach(System.out::println);
    }
}