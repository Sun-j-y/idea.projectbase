package JavaEdu.zuoye.di3zhang;

import java.util.Scanner;

/**
 * 实验一: 编写一个Java应用程序. 用户从键盘输入一个1~99999的整数,判断是几位数
 * 并判断是不是回文数
 */
public class Experiment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("输入一个1~99999的整数: ");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 99999) { // 判断输入的数是否符合要求
            // 判断num是几位数
            int x = num, i;
            for (i = 1; i < 6; i++) {
                if (x / 10 == 0)
                    break;
                x = x / 10;
            }
            System.out.println(num + "是" + i + "位数.");

            // 判断num是否是回文数
            String str = num + "";
            StringBuilder rStr = new StringBuilder(str);
            rStr.reverse();     // 将字符串str反转
            if (str.equalsIgnoreCase(String.valueOf(rStr)))
                System.out.println(str + "是回文数");
            else
                System.out.println(str + "不是回文数");
        } else {
            System.out.println("输入的数不符合要求!");
        }
    }
}
