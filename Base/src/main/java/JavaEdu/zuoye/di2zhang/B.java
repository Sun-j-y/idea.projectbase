package JavaEdu.zuoye.di2zhang;

public class B {
    public static void main(String[] args) {
        int firstLetter, lastLetter;
        char firstG = '1', lastG = '2';

        firstLetter = (int) firstG;
        lastLetter = (int) lastG;

        System.out.println(" ");
        for (int i = firstLetter; i <= lastLetter; ++i) {
            char greekLetter;

            greekLetter = (char) i;

            System.out.print(" " + greekLetter);
        }

    }
}
