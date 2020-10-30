package com.sforits.androidbaseedu.book.example._07._04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExampleTest {
    /*
     * 文件的拷贝
     * */
    public static void main(String[] args) throws FileNotFoundException {
        // 创建输入流, 读取指定文件
        FileInputStream in = new FileInputStream("D:\\Test\\logo.jpg");
        //创建文件输出流, 将读取的文件写入指定文件
        FileOutputStream out = new FileOutputStream("D:\\Test\\test-logo.txt");
        int len = 0;

    }
}
