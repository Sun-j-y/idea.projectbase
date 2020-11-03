package com.sforits.androidbaseedu.book._06._38;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleTest {
    /*
     *
     * */
    public static void main(String[] args) {
        // 创建一个list集合
        List<String> list = Arrays.asList("张三", "李四", "张小明", "张阳");

        // 使用Collection接口的parallelStream()创建并行流
        Stream<String> parallelStream = list.parallelStream();
        System.out.println(parallelStream.isParallel());  // 判断是否为并行流

        // 创建一个串行流
        Stream<String> stream = Stream.of("张三", "李四", "张小明", "张阳");
        // 使用BaseStream接口的parallel()方法转换为并行流
        Stream<String> parallel = stream.parallel();
        System.out.println(parallel.isParallel());
    }
}
