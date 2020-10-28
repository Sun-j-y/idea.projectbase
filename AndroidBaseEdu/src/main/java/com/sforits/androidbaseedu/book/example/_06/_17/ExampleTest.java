package com.sforits.androidbaseedu.book.example._06._17;

import java.util.HashMap;
import java.util.Map;

public class ExampleTest {
    public static void main(String[] args) {
        Map hashMap = new HashMap();

        hashMap.put("001", "Jack");
        hashMap.put("002", "Rose");
        hashMap.put("003", "空洞");
        hashMap.put("004", "窟窿");
        System.out.println(hashMap);

        hashMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
