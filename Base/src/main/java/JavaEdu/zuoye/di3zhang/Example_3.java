package JavaEdu.zuoye.di3zhang;

/**
 * 4(3).分别用do-while和for循环计算1+1/2!+1/3!+1/4!+...的前20项和
 */
public class Example_3 {
    public static void main(String[] args) {
        double num = 0;
        for (int i = 1; i <= 20; i++) {
            long x = 1;      // i的阶乘
            for (int j = 1; j <= i; j++) {
                x = x * j;
            }
            double n = 1.0 / x;
            num = num + n;
        }
        System.out.println("for循环计算1+1/2!+1/3!+1/4!+...的前20项和为: " + num);
        num = 0;
        int i = 1;
        do {
            long x = 1;
            int j = 1;
            do {
                x = x * j;
                j++;
            } while (j <= i);
            double n = 1.0 / x;
            num = num + n;
            i++;
        } while (i <= 20);
        System.out.println("do...while循环计算1+1/2!+1/3!+1/4!+...的前20项和为: " + num);
    }
}
