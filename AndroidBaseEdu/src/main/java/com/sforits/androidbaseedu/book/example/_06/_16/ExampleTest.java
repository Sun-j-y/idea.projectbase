package com.sforits.androidbaseedu.book.example._06._16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExampleTest {
    public static void main(String[] args) {
        Map hashMap = new HashMap();

        hashMap.put("001", "Jack");
        hashMap.put("002", "Rose");
        hashMap.put("003", "空洞");
        hashMap.put("004", "窟窿");
        System.out.println(hashMap);

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
