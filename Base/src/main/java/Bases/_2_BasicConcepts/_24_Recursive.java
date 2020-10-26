package Bases._2_BasicConcepts;

import org.junit.Test;

import java.io.IOException;
import java.util.Scanner;

/*
方法的递归操作:
    递归指的是方法自己调用自己的形式
进行递归操作时必须满足以下要求:
    必须有结束条件
    每次调用时都要改变传递的参数
*/
public class _24_Recursive {

    @Test
    public void test1() {
        System.out.println(sum(100));
    }

    /**
     * 数据的累加操作
     * 传入一个数据累加操作的最大值, 而后每次进行数据的递减, 一直累加到1
     * @param num 数据累加操作的最大值
     * @return 累加结果
     */
    public int sum(int num) {
        if (num == 1) return 1;
        return num + sum(num - 1);
    }

    @Test
    public void test2() {

    }
}
