package JavaEdu.Test;

import java.util.Scanner;

public class Java2 {
    public static int Fibonacci(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        else
            return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������һ������:");
        int n = sc.nextInt();
        int F = Fibonacci(n);
        System.out.println("��" + n + "��������ֵΪ" + F);
    }
}
