package com.sforits.androidbaseedu.book.example._05._12;

import com.sforits.androidbaseedu.utils.shell.Shell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/21-13:52 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.toString());

        System.out.println("处理器个数: " + runtime.availableProcessors());
        System.out.println("空闲内存: " + runtime.freeMemory() / 1024 / 1024 + " M");
        System.out.println("最大内存: " + runtime.maxMemory() / 1024 / 1024 + " M");

        Process cmd = runtime.exec("netsh wlan show interfaces");
//        List<String> resultList = Shell.getResultList(cmd);
//        for (String s : resultList) {
//            System.out.println(s);
//        }
        Map<String, Object> result = Shell.getResult(cmd);

        System.out.println(result.get("SSID"));
    }
}