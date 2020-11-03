package com.sforits.androidbaseedu.book._06._12;

import java.util.TreeSet;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/23-19:11 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Teacher("jack",19));
        treeSet.add(new Teacher("rose",18));
        treeSet.add(new Teacher("tom",20));
        treeSet.add(new Teacher("jack",19));
        System.out.println(treeSet);
    }
}