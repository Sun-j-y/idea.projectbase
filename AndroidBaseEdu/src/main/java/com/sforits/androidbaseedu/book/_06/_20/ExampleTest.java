package com.sforits.androidbaseedu.book._06._20;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTest {
    /*
     * TreeMap集合
     * */
    public static void main(String[] args) {
        Map map = new TreeMap(new MyComparator());

        map.put("001", "Jack");
        map.put("002", "Rose");
        map.put("003", "空洞");
        map.put("004", "窟窿");
        System.out.println(map);
    }
}
