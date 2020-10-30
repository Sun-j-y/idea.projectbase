package com.sforits.androidbaseedu.book.example._06._20;

import java.util.Comparator;

/*
 * 自定义比较器
 * */
public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}
