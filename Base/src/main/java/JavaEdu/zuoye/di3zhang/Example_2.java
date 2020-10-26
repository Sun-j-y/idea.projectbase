package JavaEdu.zuoye.di3zhang;

/**
 * 4(2).编写一个程序,求100 以内的素数
 */
public class Example_2 {
    public static void main(String[] args) {
        System.out.println("100以内的素数为: ");
        for (int i = 2; i <= 100; i++)
            if (isPrime(i))
                System.out.println(i);

    }

    /**
     * 判断一个数是否为素数
     *
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
