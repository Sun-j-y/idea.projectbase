package com.sforits.androidbaseedu.book._05._16;

import java.util.Random;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/21-16:07 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    public static void main(String[] args) {
        Random random = new Random();
        Random random1 = new Random(111);
        Random random2 = new Random(111);
        System.out.println(random.nextInt());
        System.out.println(random1.nextInt());
        System.out.println(random2.nextInt());
    }
}