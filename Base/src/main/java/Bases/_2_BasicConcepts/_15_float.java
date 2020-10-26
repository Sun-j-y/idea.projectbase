package Bases._2_BasicConcepts;

public class _15_float {
    /*
     * 使用float型
     *   小数默认是double, 转换时在数字后加F/f , 或在数字前加(float)
     * */
    public static void main(String[] args) {
        float f1 = 10.2f;
        float f2 = (float) 10.2;
        System.out.println(f1 * f2);    // float * float = float
    }
}
