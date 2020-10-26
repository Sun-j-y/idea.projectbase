package utils.math;

import org.junit.Test;

public class Number {

    @Test
    public void test() {
        isDaffodils(153);
    }

    /**
     * 判断一个整数是否是水仙花数
     * 水仙花数: 一个三位数, 每一位数字的立方和等于它本身. 如: 153
     *
     * @param num 原整数
     * @return 结果(true / false)
     */
    public static boolean isDaffodils(int num) {
        int pow = (int) (Math.pow(num % 10, 3) +  // 个位数立方
                Math.pow(num % 100 / 10, 3) +  // 十位数立方
                Math.pow(num / 100, 3));  // 百位数立方
        return pow == num && num / 1000 == 0;
    }
}
