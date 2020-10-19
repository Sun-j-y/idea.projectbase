package com.sforits.androidbaseedu.book.example._04._24;

/**
 * @Author：sforits
 * @E-mail：sforits@gmail.com
 * @Date：2020/10/19-14:42 Created by IntelliJ IDEA.
 */
public class ExampleTest {

    /*
     * 方法引用与构造器引用
     *      类名引用静态方法
     *      对象名引用方法
     * */
    public static void main(String[] args) {
        // Lambda
        printAbs(-20, n -> Math.abs(n));
        // 类名引用静态方法
        printAbs(-10, Math::abs);

        StringUtils stringUtils = new StringUtils();
        // Lambda
        printUpper("hello", t -> stringUtils.printUpperCase(t));
        // 对象名引用方法
        printUpper("World", stringUtils::printUpperCase);

        // Lambda
        printName("王五", name -> new Person(name));
        // 构造器引用
        printName("李四", Person::new);
    }

    private static void printAbs(int num, Calcable calcable) {
        System.out.println(calcable.calc(num));
    }

    private static void printUpper(String str, Printable printable) {
        printable.print(str);
    }

    public static void printName(String name, PersonBuilder personBuilder) {
        System.out.println(personBuilder.builderPerson(name).getName());
    }
}