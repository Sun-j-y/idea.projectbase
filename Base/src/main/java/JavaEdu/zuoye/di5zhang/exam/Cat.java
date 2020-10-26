package JavaEdu.zuoye.di5zhang.exam;

public class Cat extends Animal {
    @Override
    void cry() {
        System.out.println("喵喵喵...");
    }

    @Override
    String getAnimalName() {
        return "Cat";
    }
}
