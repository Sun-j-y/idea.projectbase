package JavaEdu.zuoye.di6zhang.exam;

public class Cat implements Animal {
    @Override
    public void cry() {
        System.out.println("喵喵喵...");
    }

    @Override
    public String getAnimalName() {
        return "Cat";
    }
}
