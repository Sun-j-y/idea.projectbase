package JavaEdu.zuoye.di8zhang.experiment3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ComputerDate {
    public static void main(String[] args) {
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

    }
}
