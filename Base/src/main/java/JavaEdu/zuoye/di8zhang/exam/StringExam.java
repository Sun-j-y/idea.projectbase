package JavaEdu.zuoye.di8zhang.exam;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringExam {
    public static void main(String[] args) {
        // (1)
        System.out.println("(1)");

        String str = "aBcDe";
        System.out.println("str.toUpperCase(): " + str.toUpperCase());
        System.out.println("str.toLowerCase(): " + str.toLowerCase());
        System.out.println("str.concat(\"Fg\"): " + str.concat("Fg"));

        // (2)
        System.out.println("(2)");

        System.out.println("str.charAt(0): " + str.charAt(0));
        System.out.println("str.charAt(str.length()): " + str.charAt(str.length() - 1));

        // (3) 4
        System.out.println("(3)");
        // 两个日期之间的间隔天数
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个年月日数据:");
        System.out.print("输入年份:");
        short yearOne = scanner.nextShort();
        System.out.print("输入月份:");
        byte monthOne = scanner.nextByte();
        System.out.print("输入日期:");
        byte dayOne = scanner.nextByte();

        System.out.println("输入第二个年月日数据:");
        System.out.print("输入年份:");
        short yearTwo = scanner.nextShort();
        System.out.print("输入月份:");
        byte monthTwo = scanner.nextByte();
        System.out.print("输入日期:");
        byte dayTwo = scanner.nextByte();

        Calendar calendar = Calendar.getInstance();
        calendar.set(yearOne, monthOne, dayOne);
        long timeOne = calendar.getTimeInMillis();

        calendar.set(yearTwo, monthTwo - 1, dayTwo);
        long timeTwo = calendar.getTimeInMillis();

        Date date1 = new Date(timeOne);
        Date date2 = new Date(timeTwo);

        if (date1.equals(date2))
            System.out.println("两个日期的年、月、日、完全相同");
        else if (date2.before(date1))
            System.out.println("您输入的第二个日期小于第一个日期");
        else if (date2.after(date1))
            System.out.println("您输入的第二个日期大于第一个日期");
        long days = Math.abs(timeTwo - timeOne) / 1000 / 60 / 60 / 24;
        System.out.println(yearOne + "年" + monthOne + "月" + dayOne + "日和" + yearTwo + "年" + monthTwo +
                "月" + dayTwo + "相隔" + days + "天");

        // (4)
        System.out.println("(4)");

        System.out.println("Math.PI: " + Math.PI);
        System.out.println("Math.E: " + Math.E);
        System.out.println("Math.abs(-2):(绝对值) " + Math.abs(-2));
        System.out.println("Math.abs(-2):(绝对值) " + Math.abs(-2));


        // (5) 10
        System.out.println("(5)");

        str = "ab123you";
        // 剔除非数字
        int i=0;
        try {
            i = Integer.parseInt(Pattern.compile("[^0-9]").matcher(str).replaceAll("").trim());
        } catch (Exception e) {

        }
        System.out.println(i);

        // (6)
        System.out.println("(6)");
        // 解析字符串,计算总成绩
        str = "数学87分,物理76分,英语96分";
        double sum = GetArhievement.getSum(str);
        System.out.println("总成绩: " + sum);
    }
}
