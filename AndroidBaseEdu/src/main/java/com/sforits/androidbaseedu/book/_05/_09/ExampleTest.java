package com.sforits.androidbaseedu.book._05._09;

import java.util.Properties;
import java.util.Set;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/20-16:15 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    /*
     * System类和Runtime类
     * */
    public static void main(String[] args) {
        // 获取当前系统属性
        Properties properties = System.getProperties();
        System.out.println(properties);

        // 获取所有西戎属性的 key(属性名), 返回set对象
        Set<String> propertyNames = properties.stringPropertyNames();
        for (String propertyName : propertyNames) {
            String property = System.getProperty(propertyName);
            System.out.println(propertyName + " ---> " + property);
        }
    }
}