package JavaEdu.zuoye;

import org.junit.Test;

import java.util.UUID;

public class TestDemo {

    @Test
    public void test1() {
//        char a = '你', b = '我', c = '他';
//        System.out.println(a + " 在Unicode表中的位置:" + (int) a);
//        System.out.println(b + " 在Unicode表中的位置:" + (int) b);
//        System.out.println(c + " 在Unicode表中的位置:" + (int) c);
    }

    @Test
    public void test2() {

        int h = 'α', t = 'ω';
        for (int i = h; i <= t; i++) {
            System.out.print((char) i + "  ");
        }
    }

    @Test
    public void test3() {
        String s="广东海洋大学";
        System.out.println(s.length());

        // uuid 据说全球唯一的id
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString().length());
    }
}
