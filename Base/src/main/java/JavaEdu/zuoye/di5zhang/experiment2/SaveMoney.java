package JavaEdu.zuoye.di5zhang.experiment2;

public class SaveMoney {
    public static void main(String[] args) {
        int amount = 8000;
        ConstructionBank bank1 = new ConstructionBank();
        bank1.savedMoney = amount;
        bank1.year = 8.236;
        bank1.setSavedMoneyRate(0.035);
        double interest1 = bank1.computerInterest();
        BankOfDalian bank2 = new BankOfDalian();
        bank2.savedMoney = amount;
        bank2.year = 8.236;
        bank2.setSavedMoneyRate(0.035);
        double interest2 = bank2.computerInterest();
        System.out.println("两个银行利息相差" + (interest2 - interest1) + "元\n");
    }
}
