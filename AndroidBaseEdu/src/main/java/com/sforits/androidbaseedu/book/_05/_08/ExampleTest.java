package com.sforits.androidbaseedu.book._05._08;


/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/21-13:19 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println("\033[32m" + "StringBuffer: " + "\033[0m" + stringBuffer);
        stringBuffer.append("abc");
        System.out.println("append(\"abc\") : " + stringBuffer);

    }

}