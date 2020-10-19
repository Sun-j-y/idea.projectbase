package com.sforits.androidbaseedu.book.example._04._23;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/19-14:42 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    /*
     * 函数式接口
     *      虽然Lambda表达式可以实现内部匿名类的各项功能, 但是只能在接口中有且只有一个抽象方法时才能用Lambda表达式代替内部匿名类
     *      所谓函数式接口是指 有且仅有一个抽象方法的接口
     * @FunctionalInterface
     *      注解在函数式接口上, 标注接口是一个函数式接口, 并强制编辑器进行更严格的检查, 对程序实际运行没有实质上的影响
     * */
    public static void main(String[] args) {
        animalShout(() -> System.out.println("无参"));

        showSum(10, 20, (x, y) -> x + y);
        //
        showSum(10, 20, Integer::sum);
        showSum(10, 20, (x, y) -> {
            return x + y;
        });
    }


    private static void animalShout(Animal animal) {
        animal.shout();
    }

    private static void showSum(int a, int b, Calculate calculate) {
        System.out.println("和: " + calculate.sum(a, b));
    }
}