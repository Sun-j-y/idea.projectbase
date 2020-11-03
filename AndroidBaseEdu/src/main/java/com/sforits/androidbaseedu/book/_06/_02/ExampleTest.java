package com.sforits.androidbaseedu.book._06._02;

import java.util.LinkedList;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/22-19:13 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    public static void main(String[] args) {
        // 创建LinkedList集合 类似list集合 优化了删除修改效率
        LinkedList<String> link = new LinkedList<>();
        link.add("add");
        link.add("add2");
        System.out.println(link);
        link.offer("offer"); //向集合末尾追加元素
        link.push("push"); //向集合头部追加元素
        System.out.println(link);

        String peek = link.peek();  // 获取第一个元素
        System.out.println(peek);

        link.removeFirst(); // 删除第一个元素
        link.pollLast(); // 删除随后一个元素
        System.out.println(link);

    }
}