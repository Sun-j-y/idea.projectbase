package com.sforits.androidbaseedu.book.example._06._15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExampleTest {
    /*
     * Iterator迭代器遍历Map集合
     * */
    public static void main(String[] args) {
        Map hashMap = new HashMap();

        hashMap.put("001", "Jack");
        hashMap.put("002", "Rose");
        hashMap.put("003", "空洞");
        hashMap.put("004", "窟窿");
        System.out.println(hashMap);

        Set keySet = hashMap.keySet(); //获取键的集合
        Iterator iterator = keySet.iterator();// 迭代键的集合
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object o = hashMap.get(key);
            System.out.println(key + " : " + o);
        }

    }
}
