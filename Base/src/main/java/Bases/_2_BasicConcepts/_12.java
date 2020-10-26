package Bases._2_BasicConcepts;

public class _12 {
    /*
    * 观察byte自动转型操作
    * */
    public static void main(String[] args) {
        byte num=100;
        System.out.println(num);
    }
    /*
    * 注:
    *   虽然任何一个整数都属于int型, 但Java编译时, 如果发现使用的数据类型变量为byte, 并且设置内容在byte的范围内, 就会自动帮用户
    *   实现数据类型的转换. 反之, 如果超过了byte数据范围, 则依然以int型变量操作, 此时就需要强制转换
    * */
}
