package Bases._2_BasicConcepts;

public class _16_division {
    /*
     * 关于除法的问题
     * */
    public static void main(String[] args) {
        int x = 9;
        int y = 5;
        System.out.println(x / y);  // int / int = int

        /*
        * 解决除法精度的问题
        *   将其中一个转换为double型
         * */
        //System.out.println((double) x / y);
        System.out.println(x / (double) y);
    }
}
