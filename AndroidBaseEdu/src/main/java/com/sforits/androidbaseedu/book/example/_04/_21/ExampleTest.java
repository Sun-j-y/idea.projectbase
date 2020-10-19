package com.sforits.androidbaseedu.book.example._04._21;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/19-12:59 Created by IntelliJ IDEA.
 */
public class ExampleTest {
    /*
     * 匿名内部类:
     *      在调用某个方法时, 如果该方法参数为接口类型, 除了可以传入这个接口的实现类, 还可以使用匿名内部类实现接口来作为方法参数
     *
     * */
    public static void main(String[] args) {
        String name = "小明";
        // 定义内部匿名类
        new ExampleTest().animalShout(new Animal() {
            // 实现接口方法
            @Override
            public void shout() {
                // 从jdk1.8开始, 局部内部类,匿名内部类可以访问非final的局部变量
                // 在jdk1.8之前, 只能访问final变量
                System.out.println(name + " 学猫叫");
            }
        });
    }

    public void animalShout(Animal animal) {
        animal.shout();
    }
}