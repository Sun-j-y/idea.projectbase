package Bases._2_BasicConcepts;

public class _10 {
    /*
     * 观察发生溢出的转换问题
     * */
    public static void main(String[] args) {
        long num = 2147483650L; // 该数据已经超过了int类型范围
        int x = (int) num;
        System.out.println(x);  // -2147483646
        /*
        * 结论:
        *   最终结果会相对目标类型发生溢出
        * */
    }
}
