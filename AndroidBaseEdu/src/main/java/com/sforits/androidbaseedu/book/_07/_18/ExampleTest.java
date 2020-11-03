package com.sforits.androidbaseedu.book._07._18;

import java.nio.CharBuffer;

public class ExampleTest {
    /*
     * NIO  jdk1.4以后提供的替代传统标准的I/O的相关类
     *      NIO三大核心: Buffer Channel Selector
     * Buffer
     *      CharBuffer
     * */
    public static void main(String[] args) {
        // 创建charBuffer对象, 并指定缓冲区大小为6
        CharBuffer charBuffer = CharBuffer.allocate(6);
        System.out.println("容量" + charBuffer.capacity());
        System.out.println("界限值" + charBuffer.limit());
        System.out.println("初始位置" + charBuffer.position());

        // 向CharBuffer中放入3个元素
        charBuffer.put('x');
        charBuffer.put('y');
        charBuffer.put('z');
        System.out.println("加入元素之后界限值" + charBuffer.limit());
        System.out.println("加入元素之后初始位置" + charBuffer.position());
        // 执行flip方法 反转缓冲区, limit设置为当前position位置,position设置为0
        charBuffer.flip();
        System.out.println("执行flip()界限值" + charBuffer.limit());
        System.out.println("执行flip()初始位置" + charBuffer.position());

        // 取出第一个元素
        System.out.println("第一个元素 " + charBuffer.get());
        System.out.println("取出后界限值" + charBuffer.limit());
        System.out.println("取出后初始位置" + charBuffer.position());

        // 执行clear() 清除缓冲区, position设置为0,limit设置为capacity
        charBuffer.clear();
        System.out.println("执行clear()界限值" + charBuffer.limit());
        System.out.println("执行clear()初始位置" + charBuffer.position());

        // 取得第一个元素
        System.out.println("clear()第一个元素 " + charBuffer.get());
        System.out.println("clear()后界限值" + charBuffer.limit());
        System.out.println("clear()后初始位置" + charBuffer.position());
    }
}
