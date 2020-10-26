package JavaEdu.zuoye.di5zhang.experiment2;

public class ConstructionBank extends Bank {
    double year;

    public double computerInterest() {
        super.year = (int) year;
        double r = year - (int) year;
        int day = (int) (r * 1000);
        double yearInterest = super.computerInterest();
        double dayInterest = day * 0.0001 * savedMoney;
        interest = yearInterest + dayInterest;
        System.out.println(savedMoney + "元存在建设银行" + super.year + "年零" + day + "天的利息: " + interest + "元\n");
        return interest;
    }
}
