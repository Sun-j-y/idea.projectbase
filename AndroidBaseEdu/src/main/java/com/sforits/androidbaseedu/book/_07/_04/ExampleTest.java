package com.sforits.androidbaseedu.book._07._04;

import com.sforits.androidbaseedu.utils.console.ConsoleProgressBar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleTest {
    /*
     * 文件的拷贝
     * */
    public static void main(String[] args) throws IOException {
        // 创建输入流, 读取指定文件
        FileInputStream in = new FileInputStream("D:\\Test\\logo.jpg");

        //创建文件输出流, 将读取的文件写入指定文件
        FileOutputStream out = new FileOutputStream("D:\\Test\\test-logo.txt");
        int len = 0;
        // 获取拷贝文件前的系统时间
        long start = System.currentTimeMillis();
        File file = new File("D:\\Test\\logo.jpg");
        double length = file.length();
        double i = 0;
        ConsoleProgressBar cpb = new ConsoleProgressBar(50, '#');
        // 通过循环将读取到的文件字节信息写入到新文件
        while ((len = in.read()) != -1) {
            cpb.show((int) (i * 100.0 / length));
            out.write(len);
            i++;
        }

        // 获取拷贝文件后的系统时间
        long end = System.currentTimeMillis();
        System.out.println("文件拷贝花费时间: " + (end - start) + "毫秒");
        in.close();
        out.close();
    }
}
