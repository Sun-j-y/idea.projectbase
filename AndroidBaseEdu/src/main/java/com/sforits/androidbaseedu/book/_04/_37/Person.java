package com.sforits.androidbaseedu.book._04._37;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/19-19:45 Created by IntelliJ IDEA.
 */
public class Person  extends Object{
    // 重写Object类中的finalize()方法
    @Override
    public void finalize() {
        System.out.println("对象将被作为垃圾回收...");
    }
}