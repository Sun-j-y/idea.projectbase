package JavaEdu.zuoye.di3zhang;

/**
 * 4(5).编写应用程序, 使用for循环语句计算 8+88+888+8888+...前10项之和
 */
public class Example_5 {
    public static void main(String[] args) {
        long num = 0;       // int型变量精度不够
        for (int i = 0; i < 10; i++) {
            num += iNum(i + 1);
        }
        System.out.println(" 8+88+888+8888+...前10项之和为: "+num);
    }

    /**
     * 计算第i项 8+88+888+8888+...
     *
     * @param n
     * @return
     */
    public static long iNum(int n) {
        long x = 0;
        for (int i = 0; i < n; i++)
            x = x * 10 + 8;
        return x;
    }
}
