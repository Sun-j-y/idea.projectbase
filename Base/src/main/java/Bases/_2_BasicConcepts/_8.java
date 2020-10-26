package Bases._2_BasicConcepts;

public class _8 {
    /*
     * 扩大数据类型
     * */
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE; // 取出最大值
        int min = Integer.MIN_VALUE; // 取出最小值
        // int变量 +/- long型常量 = long变量
        System.out.println(max + 1L);       // 2147483648
        System.out.println(min - (long) 1); // -2147483649
        // long型变量 +/- int型常量 = long变量
        System.out.println((long) min - 2); // -2147483650
    }
}
