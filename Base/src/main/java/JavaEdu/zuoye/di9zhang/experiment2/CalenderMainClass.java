package JavaEdu.zuoye.di9zhang.experiment2;

public class CalenderMainClass {
    public static void main(String[] args) {
        CalenderFrame calenderFrame = new CalenderFrame();
        calenderFrame.setBounds(100,100, 360,300);
        calenderFrame.setVisible(true);
        calenderFrame.setYearAndMonth(2015, 5);
    }
}
