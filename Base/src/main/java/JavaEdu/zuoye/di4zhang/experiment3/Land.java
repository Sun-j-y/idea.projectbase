package JavaEdu.zuoye.di4zhang.experiment3;

/*
编写程序模拟两个村庄共用同一口井水。
编写一个Village类，该类有一个静态的int型成员变量waterAmount，用于模拟井水的水量。在主类Land的main()方法中创建两个村庄，
一个村庄改变了waterAmount的值，另一个村庄查看waterAmount的值。
 */
public class Land {
    public static void main(String[] args) {
        // 用类名调用 setWaterAmount(int m), 并向参数传递200
        Village.setWaterAmount(200);
        int leftWater = Village.waterAmount;  // 用Village类的类名访问waterAmount
        System.out.println("水井中有 " + leftWater + "升水");
        Village zhaoZhuang = new Village("赵庄");
        Village maJiaHeZhi = new Village("马家河子");

        zhaoZhuang.setPopleNumber(80);
        maJiaHeZhi.setPopleNumber(120);
        // zhaoZhuang调用drinkWater(int n),并向参数传递50
        zhaoZhuang.drinkWater(50);
        leftWater = maJiaHeZhi.lookWaterAmount();  // maJiaHeZhi 调用 lookWaterAmount() 方法
        String name = maJiaHeZhi.name;
        System.out.println(name + " 发现水井中有 " + leftWater + "升水");
        maJiaHeZhi.drinkWater(100);
        leftWater = zhaoZhuang.lookWaterAmount();  // zhaoZhuang 调用 lookWaterAmount() 方法
        name = zhaoZhuang.name;
        System.out.println(name + " 发现水井中有 " + leftWater + "升水");
        int popleNumber = zhaoZhuang.getPopleNumber();
        System.out.println("赵庄的人口: " + popleNumber);
        popleNumber = maJiaHeZhi.getPopleNumber();
        System.out.println("马家河子的人口: " + popleNumber);
    }
}
