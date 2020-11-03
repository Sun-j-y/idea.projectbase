package com.sforits.androidbaseedu.task._03._03;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                Object o;
                return t1.compareTo(s);
            }
        });
        map.put("2", "John");
        map.put("1", "Lucy");
        map.put("5", "Amanda");
        map.put("4", "Aimee");
        map.put("3", "Smith");

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String k = iterator.next();
            String v = map.get(k);
            System.out.println(k + " - " + v);
        }
    }
}
