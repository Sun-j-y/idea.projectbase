package Bases._2_BasicConcepts;

import org.junit.Test;

public class _22_ConditionAndSwitch {
    /**
     * 条件语句 - if...else
     * 一个 if 语句包含一个布尔表达式和一条或多条语句。
     */
    @Test
    public void Test1() {
        int x = 10;

        if (x < 20) {
            System.out.print("这是 if 语句");
        }
    }

    @Test
    public void Test2() {
        // if 语句后面可以跟 else 语句，当 if 语句的布尔表达式值为 false 时，else 语句块会被执行。
        int x = 30;

        if (x < 20) {
            System.out.print("这是 if 语句");
        } else {
            System.out.print("这是 else 语句");
        }
    }

    @Test
    public void Test3() {
        /**
         * if 语句后面可以跟 else if…else 语句，这种语句可以检测到多种可能的情况。
         *
         * 使用 if，else if，else 语句的时候，需要注意下面几点：
         *
         * if 语句至多有 1 个 else 语句，else 语句在所有的 else if 语句之后。
         * if 语句可以有若干个 else if 语句，它们必须在 else 语句之前。
         * 一旦其中一个 else if 语句检测为 true，其他的 else if 以及 else 语句都将跳过执行。
         * */
        int x = 30;

        if (x == 10) {
            System.out.print("Value of X is 10");
        } else if (x == 20) {
            System.out.print("Value of X is 20");
        } else if (x == 30) {
            System.out.print("Value of X is 30");
        } else {
            System.out.print("这是 else 语句");
        }
    }

    /**
     * switch case 语句有如下规则：
     * <p>
     * switch 语句中的变量类型可以是： byte、short、int 或者 char。从 Java SE 7 开始，switch 支持字符串 String 类型了,
     * 同时 case 标签必须为字符串常量或字面量。
     * <p>
     * switch 语句可以拥有多个 case 语句。每个 case 后面跟一个要比较的值和冒号。
     * <p>
     * case 语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量。
     * <p>
     * 当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。
     * <p>
     * 当遇到 break 语句时，switch 语句终止。程序跳转到 switch 语句后面的语句执行。case 语句不必须要包含 break 语句.
     * 如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。
     * <p>
     * switch 语句可以包含一个 default 分支，该分支一般是 switch 语句的最后一个分支(可以在任何位置，但建议在最后一个).
     * default 在没有 case 语句的值和变量值相等的时候执行。default 分支不需要 break 语句。
     */
    @Test
    public void Test4() {
        //char grade = args[0].charAt(0);
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("你需要再努力努力");
                break;
            default:
                System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
    }

    @Test
    public void Test5() {
        // 如果 case 语句块中没有 break 语句时，JVM 并不会顺序输出每一个 case 对应的返回值，
        // 而是继续匹配，匹配不成功则返回默认 case。
        int i = 5;
        switch (i) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("default");
        }
    }

    @Test
    public void Test6() {
        // 如果 case 语句块中没有 break 语句时，匹配成功后，从当前 case 开始，后续所有 case 的值都会输出。
        int i = 1;
        switch (i) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("default");
        }
    }

    @Test
    public void Test7() {
        // 如果当前匹配成功的 case 语句块没有 break 语句，则从当前 case 开始，后续所有 case 的值都会输出，
        // 如果后续的 case 语句块有 break 语句则会跳出判断。
        int i = 1;
        switch (i) {
            case 0:
                System.out.println("0");
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
        }
    }
}
