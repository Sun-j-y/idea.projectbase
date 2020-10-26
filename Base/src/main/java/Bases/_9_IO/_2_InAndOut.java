package Bases._9_IO;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 从控制台输入输出
 * */
public class _2_InAndOut {

    /*
     * system.in和system.out
     *      system.in   输入一个字节
     *          BufferReader.read() 输入一个字节
     *          BufferReader.readLine() 读取一个字符串
     *      system.out  输出
     *          System.out.print    输出
     *          System.out.println  输出一行
     */
    @Test
    public void test1() throws IOException {
        char c;
        String s;
        // Java 的控制台输入由 System.in 完成。
        // 为了获得一个绑定到控制台的字符流，你可以把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流。
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader 对象创建后，我们便可以使用 read() 方法从控制台读取一个字符，或者用 readLine() 方法读取一个字符串.
        System.out.println("输入字符, 按下'q'键退出:");
        // 读取字符
        do {
            c = (char) bufferedReader.read();
            System.out.println(c);
        } while (c != 'q');

        System.out.println("输入一个字符串, 输入'exit'退出:");
        do {
            s = bufferedReader.readLine();
            System.out.println(s);
        } while (!s.equals("exit"));
    }

    /*
     * Scanner类:
     *   java.util.Scanner 是 Java5 的新特征，我们可以通过 Scanner 类来获取用户的输入。
     * */
    @Test
    public void test2() {
        // 创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        // 从键盘接收数据
        // 在读取前我们一般需要 使用 hasNext 与 hasNextLine 判断是否还有输入的数据：

        System.out.println("Scanner方式接受字符串: ");
        // 判断是否还有输入
        if (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println("输入的数据为：" + str);
        }
        scanner.close();
    }

    @Test
    public void test3() {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        scan.close();
    }

    /*
    next() 与 nextLine() 区别
        next():
            1、一定要读取到有效字符后才可以结束输入。
            2、对输入有效字符之前遇到的空白，next() 方法会自动将其去掉。
            3、只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符。
            next() 不能得到带有空格的字符串。
        nextLine()：
            1、以Enter为结束符,也就是说 nextLine()方法返回的是输入回车之前的所有字符。
            2、可以获得空白。
    如果要输入 int 或 float 类型的数据，在 Scanner 类中也有支持，但是在输入之前最好先使用 hasNextXxx() 方法进行验证，再使用 nextXxx() 来读取：
    */
    @Test
    public void test4() {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据
        int i = 0;
        float f = 0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()) {
            // 判断输入的是否是整数
            i = scan.nextInt();
            // 接收整数
            System.out.println("整数数据：" + i);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()) {
            // 判断输入的是否是小数
            f = scan.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } else {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }

    // 以下实例我们可以输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果:
    @Test
    public void test5() {
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scan.hasNextDouble()) {
            double x = scan.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum / m));
        scan.close();
    }
    // write()方法
    @Test
    public void test6() {
        for (int i = 1; i < 128; i++) {
            System.out.printf("%d",i);
            System.out.write(i);
            System.out.println();
        }
    }

}
