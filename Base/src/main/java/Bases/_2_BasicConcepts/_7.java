package Bases._2_BasicConcepts;

public class _7 {
    /*
     * 如果超过了int最大值或最小值的结果
     * */
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE; // 取出最大值
        int min =Integer.MIN_VALUE; // 取出最小值
        System.out.println(max); // 2147483647
        System.out.println(min); // -2147483648

        System.out.println(max+1); // -2147483648
        System.out.println(min-1); // 2147483647
        System.out.println(min-2); // 2147483646
    }

}
