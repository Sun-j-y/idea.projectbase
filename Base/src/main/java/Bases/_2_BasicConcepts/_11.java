package Bases._2_BasicConcepts;

public class _11 {
    /*
    * 观察byte类型转换
    * */
    public static void main(String[] args) {
        /*
        * byte类型数据范围-128<= byte <= 127
        * */
        int num=130;            // 此范围超过了byte定义
        byte x=(byte)num;
        System.out.println(x);  // -126
    }
}
