package com.sforits.androidbaseedu.book._06._37;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleTest {
    /*
     * 收集
     * */
    public static void main(String[] args) {
        // 通过字符串源数据创建一个Stream流对象
        Stream<String> stream = Stream.of("张三", "李四", "张小明", "张扬");
        List<String> list = stream.filter(i -> i.startsWith("张"))
                .collect(Collectors.toList());
        System.out.println(list);

        //
        Stream<String> stream2 = Stream.of("张三", "李四", "张小明", "张扬");
        String str = stream2.filter(i -> i.startsWith("张"))
                .collect(Collectors.joining(" and "));
        System.out.println(str);
    }
}
