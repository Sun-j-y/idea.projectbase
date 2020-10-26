package Bases._2_BasicConcepts;

public class _5 {
    /*
     * 定义int型变量
     *       任何一个数字常量(如 30  100 ), 在Java中都属于 int 数据类型; 即Java中所有设置的整数内容默认情况下都是int型数据
     * */
    public static void main(String args[]) {
        // 为变量设置内容使用如下格式: 数据类型 变量名称 = 常量;
        int num = 10;                // 10是常量, 默认数据类型是int
        int result = num * 2;           // 利用num变量内容乘以2, 并且将值赋值给result
        System.out.println(result); // 在控制台打印result
    }
}
