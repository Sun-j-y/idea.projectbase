package com.sforits.androidbaseedu.book.example._06._03;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/23-13:08 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    /*
    * Iterator遍历集合
    * */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            if (next.equals("a")){
                iterator.remove();
            }
            System.out.println(next);
        }
    }
}