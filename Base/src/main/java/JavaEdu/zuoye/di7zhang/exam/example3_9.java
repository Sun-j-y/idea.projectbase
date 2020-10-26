package JavaEdu.zuoye.di7zhang.exam;

import java.util.Scanner;

public class example3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (scanner.hasNextDouble()) {
            double v = scanner.nextDouble();
            assert v < 100 : "非法的数字";
            m = m + 1;
            sum += v;
        }
        System.out.println(m + " 个数的和: " + sum);
        System.out.println(m + " 个数的平均值: " + sum / m);
    }
}
