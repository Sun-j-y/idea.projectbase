package com.sforits.androidbaseedu.book._07._06;

import java.io.*;

public class ExampleTest {
    /*
     * 字节缓冲流
     * */
    public static void main(String[] args) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("D:\\Test\\logo.jpg"));
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:\\Test\\test-logo3.txt"));
        int len = 0;
        long start = System.currentTimeMillis();

        while ((len = in.read()) != -1) {

            out.write(len);

        }

        long end = System.currentTimeMillis();
        System.out.println("文件拷贝花费时间: " + (end - start) + "毫秒");
        in.close();
        out.close();
    }
}
