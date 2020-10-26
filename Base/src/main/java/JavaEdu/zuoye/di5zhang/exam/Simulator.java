package JavaEdu.zuoye.di5zhang.exam;

public class Simulator {
    void playSound(Animal animal) {
        animal.cry();
        System.out.println("动物的名字是: " + animal.getAnimalName());
    }
}
