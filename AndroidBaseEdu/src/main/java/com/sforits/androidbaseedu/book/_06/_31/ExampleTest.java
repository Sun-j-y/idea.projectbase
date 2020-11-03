package com.sforits.androidbaseedu.book._06._31;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExampleTest {
    /*
     * 聚合操作
     *      JDK1.8之后新增了一个Stream接口, 该接口可以将集合、数组中的元素转换为Stream流的形式,
     *      并结合Lambda表达式的优势进一步简化集合、数组中方元素的查找、过滤、转换等操作. 这就是聚合操作
     * 
     * 语法: 聚合操作没有绝对的语法规范, 根据实际操作流程, 主要分为3个步骤：
     *      1. 将原始集合或数组对象转换为Stream流对象
     *      2. 对stream流对象中的元素进行一系列的过滤、查找等中间操作, 然后仍然返回一个Stream对象
     *      3. 对Stream流进行遍历、统计、收集等终结操作， 获得想要的结果
     * */
    public static void main(String[] args) {
        //创建一个List集合
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("小明");
        list.add("小红");
        list.add("小红人");

        // 创建一个Stream流对象
        Stream<String> stream = list.stream();
        // 对Stream流对象的元素分别进行过滤、截取操作
        Stream<String> stream2 = stream.filter(i -> i.startsWith("小"));
        Stream<String> stream3 = stream2.limit(2);
        stream3.forEach(j -> System.out.println(j));

        System.out.println("==============================");

        // 通过链式表达式的形式完成聚合操作
        list.stream().filter(i -> i.startsWith("小"))
                .limit(2)
                .forEach(System.out::println);
    }
}
