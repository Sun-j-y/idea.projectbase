package JavaEdu.zuoye.di8zhang.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetArhievement {
    public static double getSum(String string) {
        Scanner scanner = new Scanner(string);
        scanner.useDelimiter("[^1234567890.]+");

        double sum = 0;
        while (scanner.hasNext()) {
            try {
                sum += scanner.nextDouble();
            } catch (InputMismatchException e) {
                String next = scanner.next();
            }
        }

        return sum;
    }
}
