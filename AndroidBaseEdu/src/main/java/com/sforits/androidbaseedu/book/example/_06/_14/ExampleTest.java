package com.sforits.androidbaseedu.book.example._06._14;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/26-20:52 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    /*
     * HashMap集合
     * */
    public static void main(String[] args) {
        Map hashMap = new HashMap();

        hashMap.put("001", "Jack");
        hashMap.put("002", "Rose");
        hashMap.put("003", "空洞");
        hashMap.put("004", "窟窿");
        hashMap.put("001", "Jase");  // key值重复的键值对会覆盖之前插入的键值对

        System.out.println(hashMap);
        // 查看对象是否存在
        System.out.println(hashMap.containsKey("001"));
        // 获取指定键对象映射的值
        System.out.println(hashMap.get("001"));
        // 分别获取键对象和值对象
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        // 替换
        hashMap.replace("001", "Jack");
        System.out.println(hashMap);
        // 移除
        hashMap.remove("004");
        System.out.println(hashMap);
    }
}