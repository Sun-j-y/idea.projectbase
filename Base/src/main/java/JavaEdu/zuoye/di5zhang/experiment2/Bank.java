package JavaEdu.zuoye.di5zhang.experiment2;

public class Bank {
    int savedMoney;
    int year;
    double interest;
    double interestRate = 0.29;

    public double computerInterest() {
        interest = year * interestRate * savedMoney;
        return interest;
    }

    public void setSavedMoneyRate(double rate) {
        interestRate = rate;
    }
}
