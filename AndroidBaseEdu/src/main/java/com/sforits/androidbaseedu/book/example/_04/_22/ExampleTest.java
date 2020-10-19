package com.sforits.androidbaseedu.book.example._04._22;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/19-13:38 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    /*
     * Lambda表达式  -  jdk1.8引入的重要语法
     *      使用一个简单清晰的表达式来表达一个接口
     *      简化对集合以及数组数据遍历,过滤,提取等操作
     * 语法:
     *      ([数据类型 参数名,...])->{ 表达式主体 }
     * */
    public static void main(String[] args) {
        /*
         * 匿名内部类的一个缺点 如果接口非常简单 其语法显得比较冗余
         * */
        String name = "小明";
        // 匿名内部类
        new ExampleTest().animalShout(new Animal() {
            @Override
            public void shout() {
                System.out.println("匿名内部类: " + name);
            }
        });

        // Lambda表达式
        new ExampleTest().animalShout(() -> {
            System.out.println("Lambda表达式: " + name);
        });
        new ExampleTest().animalShout(() -> System.out.println("Lambda表达式2: " + name));
    }

    public void animalShout(Animal animal) {
        animal.shout();
    }
}