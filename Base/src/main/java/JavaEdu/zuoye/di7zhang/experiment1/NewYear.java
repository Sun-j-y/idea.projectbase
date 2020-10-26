package JavaEdu.zuoye.di7zhang.experiment1;

class MobileShop {

    private int mobileAmount; // 手机数量

    InnerPurchaseMoney purchaseMoney1;
    InnerPurchaseMoney purchaseMoney2;

    MobileShop() {
        purchaseMoney1 = new InnerPurchaseMoney(20000);
        purchaseMoney2 = new InnerPurchaseMoney(10000);
    }

    public void setMobileAmount(int mobileAmount) {
        this.mobileAmount = mobileAmount;
    }

    public int getMobileAmount() {
        return mobileAmount;
    }

    class InnerPurchaseMoney {
        int moneyVaule;

        InnerPurchaseMoney(int m) {
            moneyVaule = m;
        }

        void buyMobile() {
            if (moneyVaule >= 20000) {
                mobileAmount = mobileAmount - 6;
                System.out.println("用价值 " + moneyVaule + " 的内部优惠卷买了6部手机");
            } else if (mobileAmount < 20000 && mobileAmount >= 10000) {
                System.out.println("用价值 " + moneyVaule + " 的内部优惠卷买了3部手机");
            }
        }
    }
}


public class NewYear {
    public static void main(String[] args) {
        MobileShop mobileShop = new MobileShop();
        mobileShop.setMobileAmount(30);
        System.out.println("手机专卖店目前有 "+mobileShop.getMobileAmount()+" 部手机");
        mobileShop.purchaseMoney1.buyMobile();
        mobileShop.purchaseMoney2.buyMobile();
        System.out.println("手机专卖店目前有 "+mobileShop.getMobileAmount()+" 部手机");
    }
}
