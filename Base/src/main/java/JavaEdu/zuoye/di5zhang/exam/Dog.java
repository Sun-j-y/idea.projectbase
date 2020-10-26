package JavaEdu.zuoye.di5zhang.exam;

public class Dog extends Animal {

    @Override
    void cry() {
        System.out.println("汪汪汪...");
    }

    @Override
    String getAnimalName() {
        return "Dog";
    }
}
