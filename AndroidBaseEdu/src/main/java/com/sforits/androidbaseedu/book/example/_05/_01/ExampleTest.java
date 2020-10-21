package com.sforits.androidbaseedu.book.example._05._01;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/20-15:12 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    public static void main(String[] args) {
        /*
         * 声明字符串的几种方式
         *      String str = new String()   创建一个空字符串
         *      String str = new String("abc")  创建一个内容为 "abc" 的字符串
         *      String str = new String(new char[] {'A','B','C'})   创建一个内容为 "ABC" 的字符串
         *
         * 建议直接使用 String str = "";的方式建立一个字符串
         * */
        String str = new String();
        String str2 = new String("abc");
        String str3 = new String(new char[]{'A', 'b', 'C'});

    }
}