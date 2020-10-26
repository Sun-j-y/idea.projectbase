package JavaEdu.zuoye.di3zhang;

import java.util.Scanner;

/**
 * 实验二: 猜数字游戏
 * 编写一个Java应用程序, 实现下列功能:
 * 程序随机分配个用户一个1~100之间的整数
 * 用户输入自己的猜测
 * 程序返回提示信息, 提示信息分别是"猜大了"和"猜小了"或"猜对了"
 * 用户根据提示信息再次输入猜测, 知道提示信息是"猜对了"
 */
public class Experiment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("猜数字游戏(1~100)!");
        while (true) {
            int random = (int) (Math.random() * 100);
            while (true) {
                System.out.print("请输入: ");
                int num = scanner.nextInt();

                if (num < random)
                    System.out.println("猜小了!");
                else if (num > random)
                    System.out.println("猜大了!");
                else
                    break;
            }
            System.out.println("猜对了!");

            // 判断游戏是否继续进行
            System.out.print("再来一次(n/y)? : ");
            String next = scanner.next();
            if (next.equalsIgnoreCase("n")) break;
            else if (next.equalsIgnoreCase("y")) System.out.println("新的游戏!");
            else System.out.println("错误的输入!");
        }
        System.out.println("游戏结束.");
    }
}
