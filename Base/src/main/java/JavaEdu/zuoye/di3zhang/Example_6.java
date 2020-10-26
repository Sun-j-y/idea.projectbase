package JavaEdu.zuoye.di3zhang;

/**
 * 4(6).编写应用程序, 输出满足 1+2+3+4+...+n<8888 的最大整数
 */
public class Example_6 {
    public static void main(String[] args) {
        int x = 0, i;
        for (i = 0; x < 8888; i++)
            x += i;
        System.out.println("满足 1+2+3+4+...+n<8888 的最大整数: " + (i - 1));
    }
}
