package com.sforits.androidbaseedu.book._06._11;

import java.util.TreeSet;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/23-14:45 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    /*
     * TreeSet 平衡二叉树
     * */
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(1);
        treeSet.add(21);
        System.out.println(treeSet);

        System.out.println("第一个元素: "+treeSet.first());
        System.out.println("最后一个元素: "+treeSet.last());

        System.out.println("集合中<=9的最大的元素: "+treeSet.floor(9));
        System.out.println("集合中>10的最小元素: "+treeSet.higher(10));

        Object first = treeSet.pollFirst();
        System.out.println("删除的第一个元素: "+first);
        System.out.println(treeSet);
    }
}