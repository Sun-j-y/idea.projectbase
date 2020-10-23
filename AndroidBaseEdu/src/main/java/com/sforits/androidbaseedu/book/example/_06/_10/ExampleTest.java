package com.sforits.androidbaseedu.book.example._06._10;

import java.util.HashSet;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/23-13:37 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    /*
     * HashSet 自定义类型对象
     * */
    public static void main(String[] args) {
//        HashSet<Student> students = new HashSet<>();
        HashSet hashSet = new HashSet();
        Student jack = new Student("1", "jack");
        Student rose = new Student("2", "rose");
        Student rose2 = new Student("2", "rose");
        hashSet.add(jack);
        hashSet.add(rose);
        hashSet.add(rose2);

        /*
         * 自定义对象去重 自定义对象要重写hashCode()和equals()方法 提供相应的判断方法
         * */
        System.out.println(hashSet);

    }
}