package Bases._2_BasicConcepts;

public class _6 {
    /*
     * 观察常量与变量的区别
     * */
    public static void main(String[] args) {
        // 所有的变量名称在同一块代码中只能声明一次
        int num = 10; // 10是常量, 默认类型是int
        // 取出num变量的内容乘以2, 并将其重新赋值给num
        num = num * 2;
        System.out.println(num);
    }
    /*
    * 注:
    *   每一个操作后都加上一个" "(空格), 这样做目的是避免由于编译器bug所造成的非正常性语法的编译错误
    * */
}
