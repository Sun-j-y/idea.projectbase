package JavaEdu.zuoye.di3zhang;

/**
 * 4(4).编写程序,输出1000以内的所有完数
 */
public class Example_4 {
    public static void main(String[] args) {
        System.out.println("1000以内的完数为: ");
        for (int i = 1; i < 1000; i++) {
            if (isPerfect(i))
                System.out.println(i);
        }
    }

    /**
     * 判断一个数是否为完数
     *
     * @param n
     * @return
     */
    public static boolean isPerfect(int n) {
        int x = 0;    // 因子之和
        for (int i = 1; i < n; i++)
            if (n % i == 0)
                x = x + i;
        if (x == n)
            return true;
        return false;
    }
}
