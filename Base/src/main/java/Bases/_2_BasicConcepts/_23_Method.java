package Bases._2_BasicConcepts;

import org.junit.Test;

/*
方法(函数): Method/Function
    主要功能是封装一段可执行代码, 这样不仅可以进行重复调用, 更可以方便的实现代码维护

命名规范:
    第一个单词首字母小写, 之后每一个单词首字母大写. 如: printInfo(), testDemo();

定义语法:
public(权限) static 返回值类型 方法名称(参数类型 参数名称...){
    方法体(要执行的操作);
    [return 返回值;]
}
注:
    方法没有返回值, 可以不使用return返回内容. 但是可以使用return结束方法调用
*/
public class _23_Method {

    @Test
    public void Test1() {
        testDemo();
//        testDemo2(true);
//        testDemo3(true);
//        testDemo4(true);

        testDemo(1);
    }

    // 无参无返回值的方法
    public void testDemo() {
        System.out.println(  "这是一个方法!");
    }

    // 有参无返回值的方法
    public void testDemo2(boolean b) {
        if (b) System.out.println("这是一个有参数的方法!");
    }

    // 有参有返回值的方法
    public boolean testDemo3(boolean b) {
        System.out.println("这是一个有参数有返回值的方法, 返回值为: " + b + "!");
        return b;
    }

    // 利用return结束方法调用
    public void testDemo4(boolean b) {
         /*
        注:
            如果在方法中执行了return语句, 那么就表示其之后的代码不再执行而直接结束方法调用. 如果此方法有返回值类型,
            则必须返回相应类型的数据. 如果没有返回值类型, 则可以直接写 "return;". 一般结合分支判断一起使用
        */
        if (b) {
            System.out.println("方法中止!");
            return;
        }
        System.out.println(b);
    }

    /*
    方法的重载
        指方法名称相同, 参数类型或个数不同, 调用时会按照方法的参数类型或个数调用相应的方法
     */

    public void testDemo(int n) {
        for (int j = 0; j < n; j++) {
            System.out.println("这是重载后的tsetDemo方法!");
        }
    }
}
