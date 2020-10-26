package JavaEdu.zuoye.di3zhang;

/**
 * 4(1).编写一个程, 求 1!+2!+3!+...+10!
 */
public class Example_1 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            int x = 1;
            for (int j = 1; j <= i; j++) {
                x = x * i;
            }
            num += x;
        }
        System.out.println("1!+2!+3!+...+10! = " + num);
    }
}
