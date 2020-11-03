package com.sforits.androidbaseedu.book._07._19;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class ExampleTest {
    /*
     * NIO  jdk1.4以后提供的替代传统标准的I/O的相关类
     *      NIO三大核心: Buffer Channel Selector
     * Channel
     *      FileChannel
     * */
    public static void main(String[] args) throws IOException {
        // 创建RandomAccessFile对象, 指定源文件 读写模式
        RandomAccessFile rw = new RandomAccessFile("D:/Test/logo.jpg", "rw");
        // 获取源文件FileChannel通道
        FileChannel in = rw.getChannel();
        // 创建RandomAccessFile对象, 指定目标文件 读写模式
        RandomAccessFile rw1 = new RandomAccessFile("D:/Test/logo-channel.jpg", "rw");
        // 获取目标文件FileChannel通道
        FileChannel out = rw1.getChannel();

        // 使用transferTo()方法进行整体复制
        long transfer = in.transferTo(0, in.size(), out);
        if (transfer > 0) {
            System.out.println("复制成功");
        }

        rw.close();
        rw1.close();
        in.close();
        out.close();
    }

}
