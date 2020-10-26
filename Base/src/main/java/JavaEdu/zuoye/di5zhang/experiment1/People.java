package JavaEdu.zuoye.di5zhang.experiment1;

public class People {
    protected double height;
    protected double weight;

    public void speakHello() {
        System.out.println("yayayaya");
    }

    public void averageHeight() {
        height = 173;
        System.out.println("acerage height: " + height);
    }

    public void averageWeight() {
        weight = 70;
        System.out.println("average weight: " + weight);
    }
}
