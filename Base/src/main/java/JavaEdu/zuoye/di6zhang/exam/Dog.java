package JavaEdu.zuoye.di6zhang.exam;

public class Dog implements Animal {

    @Override
    public void cry() {
        System.out.println("汪汪汪...");
    }

    @Override
    public String getAnimalName() {
        return "Dog";
    }
}
