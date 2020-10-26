package Bases._2_BasicConcepts;

public class _9 {
    /*
     * 将范围大的数据类型变为范围小的数据类型
     * */
    public static void main(String[] args) {
        long num = 1000;    // 1000常量是int型, 使用long接收, 发生向大范围转型
        int x = (int) num;  // 把long型转换为int型(强制转换)
        System.out.println(x);
    }
    /*
    * 注:
    *   虽然程序支持强制类型转换, 范围大的数据类型转换为范围小的数据类型是要考虑是否发生溢出
    * */
}
