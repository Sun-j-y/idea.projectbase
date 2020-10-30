package com.sforits.androidbaseedu.book.example._07._01;

import java.io.FileInputStream;
import java.io.IOException;

public class ExampleTest {
    public static void main(String[] args) throws IOException {
        // 创建一个字节输入流用来读取文件
        FileInputStream fileInputStream = new FileInputStream("D:\\Works\\IDEA\\ProjectBase\\AndroidBaseEdu\\src\\main\\java\\com\\sforits\\androidbaseedu\\book\\example\\_07\\file\\test1.txt");
        // 定义一个int类型的变量
        int b = 0;
        while ((b = fileInputStream.read()) != -1) {
            System.out.println(b);
        }
        // 关闭流
        fileInputStream.close();
    }
}
