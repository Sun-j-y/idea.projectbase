package com.sforits.androidbaseedu.book._07._13;

import java.io.File;
import java.util.Arrays;

public class ExampleTest {
    /*
     *
     * */
    public static void main(String[] args) {
        File file = new File("D:/Test");

        if (file.isDirectory()) {  // 判断是否是一个目录
            String[] list = file.list((f, n) -> {
                return !n.endsWith(".txt");
            });
            assert list != null;
            Arrays.stream(list).forEach(System.out::println);
        }
    }
}
