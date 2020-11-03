package com.sforits.androidbaseedu.book._05._20;

import java.util.Calendar;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/21-16:43 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int Year = calendar.get(Calendar.YEAR);
        System.out.println(Year);
    }
}