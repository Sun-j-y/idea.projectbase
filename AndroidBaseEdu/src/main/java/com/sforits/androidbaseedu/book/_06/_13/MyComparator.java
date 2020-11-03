package com.sforits.androidbaseedu.book._06._13;

import java.util.Comparator;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/23-19:24 Created by IntelliJ IDEA.
 */
public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s1.length() - s2.length();
    }
}