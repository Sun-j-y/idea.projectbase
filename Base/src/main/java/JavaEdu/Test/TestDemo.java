package JavaEdu.Test;

import org.junit.Test;

public class TestDemo {

    @Test
    public void test1() {
        int start = 5, end = 5000, n = 0, c1, c2;
        long Stime = System.currentTimeMillis();
        for (int i = start; i < end; i++) {
            c1 = test(i);
            for (int j = i + 1; j <= end; j++) {
                c2 = test(j);
                if (c1 == j && c2 == i) {
                    n++;
                    System.out.println(i + "  " + j);
                }
            }
        }
        long Etime = System.currentTimeMillis();
        if (n == 0) System.out.println("None.");
        System.out.println(Etime - Stime);
    }

    public int test(int a) {
        int i, sum = 0;
        for (i = 1; i <= a / 2; i++)
            if (a % i == 0) sum += i;

        return sum;
    }
}
