package com.sforits.androidbaseedu.book._07._17;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ExampleTest {
    /*
     * RandomAccessFile
     *   该类提供了从任一位置执行读写文件的操作
     * */
    public static void main(String[] args) throws IOException {
        /* 参数:
         * name     要读取的文件
         * mode     读取模式    r 只读 rw 读写 rws  rwd
         */
        RandomAccessFile rw = new RandomAccessFile("D:/Test/test1.txt", "rw");

        System.out.println(rw.readLine());
        int times = Integer.parseInt(rw.readLine()) - 1;
        System.out.println(times);
    }
}
