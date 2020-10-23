package com.sforits.androidbaseedu.book.example._06._13;

import java.util.TreeSet;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/23-19:24 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new MyComparator());

        treeSet.add("Jack");
        treeSet.add("Hello");
        treeSet.add("Rose");
        System.out.println(treeSet);
        // 创建集合时使用lambda表达式定制排序规则
        treeSet = new TreeSet(((o1, o2) -> {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return s1.length() - s2.length();
        }));
    }
}