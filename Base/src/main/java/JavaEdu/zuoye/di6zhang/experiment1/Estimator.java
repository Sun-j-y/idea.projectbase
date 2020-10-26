package JavaEdu.zuoye.di6zhang.experiment1;

public class Estimator {
    public static void main(String[] args) {
        double a[] = {9.89, 9.88, 9.99, 9.12, 9.69, 9.76, 8.97};
        double b[] = {89, 56, 78, 90, 100, 77, 56, 45, 36, 79, 98};
        ComputerAverage computer = new Gymnastics();
        double average = computer.average(a);
        System.out.printf("\n体操选手最后得分: %5.3f\n", average);
        computer = new School();
        double average1 = computer.average(b);
        System.out.printf("班级考试平均分数: %-5.2f", average1);
    }
}
