package com.sforits.androidbaseedu.book.example._06._22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ExampleTest {
    /*
     * Map接口的一个实现类Hashtable, 和HashMap类似 但其线程安全 效率不如HashMap 基本废弃
     * 但其子类 Properties在实际应用中非常重要, 用于存取应用配置项
     * */
    public static void main(String[] args) throws IOException {
        sum(1, 2, 3, 4, 5, 6);

        //
        Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\Works\\IDEA\\ProjectBase\\AndroidBaseEdu\\target\\classes\\com\\sforits\\androidbaseedu\\book\\example\\_06\\_22\\test.properties"));
        properties.forEach((k, v) -> System.out.println(k + " = " + v));

        FileOutputStream out = new FileOutputStream("D:\\Works\\IDEA\\ProjectBase\\AndroidBaseEdu\\target\\classes\\com\\sforits\\androidbaseedu\\book\\example\\_06\\_22\\test.properties");
        properties.setProperty("charset", "utf8");
        properties.store(out, "新增charset编码");
    }

    public static void sum(Integer... integers) {
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
        System.out.println();  //换行
    }
}
