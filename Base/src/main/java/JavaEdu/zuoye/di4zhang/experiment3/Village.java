package JavaEdu.zuoye.di4zhang.experiment3;

public class Village {
    static int waterAmount; // 模拟井水的水量
    int popleNumber;  // 村庄人数
    String name;  // 村庄的名字

    Village(String n) {
        name = n;
    }

    static void setWaterAmount(int n) {
        if (n > 0) {
            waterAmount = n;
        }
    }

    void drinkWater(int n) {
        if (waterAmount - n >= 0) {
            waterAmount = waterAmount - n;
            System.out.println(name + " 喝了" + n + "升水");
        } else
            waterAmount = 0;
    }

    static int lookWaterAmount() {
        return waterAmount;
    }

    void setPopleNumber(int num) {
        popleNumber = num;
    }

    int getPopleNumber() {
        return popleNumber;
    }
}

