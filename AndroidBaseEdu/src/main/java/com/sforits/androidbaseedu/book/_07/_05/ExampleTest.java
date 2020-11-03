package com.sforits.androidbaseedu.book._07._05;

import com.sforits.androidbaseedu.utils.console.ConsoleProgressBar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleTest {
    /*
     * 字节流缓冲区
     * */
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("D:\\Test\\logo.jpg");
        FileOutputStream out = new FileOutputStream("D:\\Test\\test-logo2.txt");

        int len;
        byte[] buff = new byte[1024];
        long start = System.currentTimeMillis();

        double length = in.available();
        double i = 1;
        ConsoleProgressBar cpb = new ConsoleProgressBar(50, '#');

        while ((len = in.read(buff)) != -1) {
            cpb.show((int) (((i - 1) * 100.0 + buff.length) / length));
            out.write(buff, 0, len);
            i++;
        }

        long end = System.currentTimeMillis();
        System.out.println("文件拷贝花费时间: " + (end - start) + "毫秒");
        in.close();
        out.close();
    }
}
