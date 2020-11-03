package com.sforits.androidbaseedu.book._05._14;

import java.io.IOException;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/21-15:50 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 打开记事本
        Process exec = Runtime.getRuntime().exec("notepad.exe");
        // 线程休眠3秒
        Thread.sleep(3000);
        // 摧毁进程
        exec.destroy();
    }
}