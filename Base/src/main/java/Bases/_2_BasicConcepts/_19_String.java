package Bases._2_BasicConcepts;

public class _19_String {
    /*
     *  Java中支持多种转义字符:
     *      换行(\n) 制表符(\t) \(\\) 双引号(\") 单引号(\')
     * */
    public static void main(String[] args) {
        /*
         * 观察 String 的操作
         * */
        String str = "Hello World!"; // 字符串变量
        System.out.println(str);
        System.out.println("Hello World!");

        /*
         * 字符串链接
         * */
        String str2 = "Hello";
        str2 = str2 + " World";
        str2 += "!!!";
        System.out.println(str2);

        /*
         * 加法操作与字符串连接同时出现
         * */
        int num = 100;
        double num2 = 99.9;
        String str3 = "加法计算: " + num + num2;
        System.out.println(str3);
        /*
         * 可看出
         *   int型变量num在与字符串链接(+)后, 首先变为字符串型, 然后继续连接num2这个double型变量
         *   最终结果变为字符串的连接
         * */

        /*
         * 改变运算优先级
         * */
        String str4 = "加法计算: " + (num + num2);
        System.out.println(str4);

        /*
         * 转义字符
         * */
        String str5 = "Hello\"World\"\n\tHello MLDN";
        System.out.println(str5);
    }
}
