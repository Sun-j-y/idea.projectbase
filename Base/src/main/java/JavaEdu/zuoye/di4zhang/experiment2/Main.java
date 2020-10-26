package JavaEdu.zuoye.di4zhang.experiment2;

/**
 * 第四章 实验二
 * 实验要求:
 * 编写一个Java应用程序, 模拟家庭买一台电视, 即家庭将电视作为自己的一个成员, 即通过调用一个方法将某个电视的引用
 * 传递给自己的电视成员。具体要求如下:
 * <p>
 * - 有三个源文件: TV.java , Family.java , Main.java, 其中TV.java中的TV类负责创建"电视"对象, Famliy.java中的
 * Familiy类负责创建"家庭对象",MainClass.java是主类
 * - 在主类的main()方法中首先使用TV类创建一个对象 haierTV , 然后使用Familiy类在创建一个对象zhangSanFamiliy ,
 * 并将先前 TV 类的实例 haierTV 的引用传递给zhangSanFamiliy 对象的成员变量 homeTV
 */
public class Main {
    public static void main(String[] args) {
        TV haierTV = new TV();

        // haierTV 调用 setChannel(int m) , 并向参数m传递5
        haierTV.setChannel(5);
        System.out.println("haierTV的频道是: " + haierTV.getChannel());
        Family zhangSanFamily = new Family();
        // zhangSanFamily 调用void buyTV(TV tv) 方法, 并将 haierTV 传递给参数TV
        zhangSanFamily.buyTV(haierTV);
        System.out.println("zhangSanFamily开始看电视节目");
        zhangSanFamily.seeTV();
        int m = 2;
        System.out.println("zhangSanFamily将电视更换到 " + m + " 频道");
        zhangSanFamily.remoteControl(m);
        System.out.println("haierTV 的频道是 " + haierTV.getChannel());
        System.out.println("zhangSanFamily 再看电视节目");
        zhangSanFamily.seeTV();
    }

}
