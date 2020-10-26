package Bases._2_BasicConcepts;

import org.junit.Test;

/**
 * 运算符
 */
public class _20_Operator {
    /**
     * 算术运算符
     * +	    加法: 相加运算符两侧的值	            A + B 等于 30
     * -	    减法: 左操作数减去右操作数	        A – B 等于 -10
     * *        乘法: 相乘操作符两侧的值	A           * B等于200
     * /	    除法: 左操作数除以右操作数	        B / A等于2
     * ％	    取余: 左操作数除以右操作数的余数	    B%A等于0
     * ++	    自增: 操作数的值增加1	                B++ 或 ++B 等于 21（区别详见下文）
     * --	    自减: 操作数的值减少1	                B-- 或 --B 等于 19（区别详见下文）
     */
    @Test
    public void Test1() {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a--   = " + (a--));
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));
    }

    /**
     * 自增自减运算符
     * 1、自增（++）自减（--）运算符是一种特殊的算术运算符，在算术运算符中需要两个操作数来进行运算，而自增自减运算符是一个操作数。
     * 2、前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
     * 3、后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算 实例：
     */
    @Test
    public void Test2() {
        int a = 3;//定义一个变量；
        int b = ++a;//自增运算
        int c = 3;
        int d = --c;//自减运算
        System.out.println("进行自增运算后的值等于" + b);
        System.out.println("进行自减运算后的值等于" + d);
        /**
         * 解析
         *      int b = ++a; 拆分运算过程为: a=a+1=4; b=a=4, 最后结果为b=4,a=4
         *      int d = --c; 拆分运算过程为: c=c-1=2; d=c=2, 最后结果为d=2,c=2
         * */
    }

    @Test
    public void Test3() {
        int a = 5;//定义一个变量；
        int b = 5;
        int x = 2 * ++a;
        int y = 2 * b++;
        System.out.println("自增运算符前缀运算后a=" + a + ",x=" + x);
        System.out.println("自增运算符后缀运算后b=" + b + ",y=" + y);
    }

    /**
     * 关系运算符
     * ==	检查如果两个操作数的值是否相等，如果相等则条件为真。	            (A == B) 为假。
     * !=	检查如果两个操作数的值是否相等，如果值不相等则条件为真。	        (A != B) 为真。
     * > 	检查左操作数的值是否大于右操作数的值，如果是那么条件为真。	        (A > B) 为假。
     * < 	检查左操作数的值是否小于右操作数的值，如果是那么条件为真。	        (A < B) 为真。
     * >=	检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。	(A> = B) 为假。
     * <=	检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。	(A <= B) 为真。
     */
    @Test
    public void Test4() {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));
    }

    /**
     * 位运算符
     * Java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。
     * 位运算符作用在所有的位上，并且按位运算。
     * <p>
     * 假设a = 60，b = 13;它们的二进制格式表示将如下：
     * A = 0011 1100
     * B = 0000 1101
     * <p>
     * ＆	如果相对应位都是1，则结果为1，否则为0	                                        (A＆B），得到12，即0000 1100
     * |	如果相对应位都是 0，则结果为 0，否则为 1	                                    (A | B）得到61，即 0011 1101
     * ^	如果相对应位值相同，则结果为0，否则为1	                                        (A ^ B）得到49，即 0011 0001
     * 〜	按位取反运算符翻转操作数的每一位，即0变成1，1变成0。	                        (〜A）得到-61，即1100 0011
     * << 	按位左移运算符。左操作数按位左移右操作数指定的位数。	                        A << 2得到240，即 1111 0000
     * >> 	按位右移运算符。左操作数按位右移右操作数指定的位数。	                        A >> 2得到15即 1111
     * >>> 	按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充.	A>>>2得到15即0000 1111
     */
    @Test
    public void Test5() {
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);
    }

    /**
     * 逻辑运算符
     * <p>
     * &&	逻辑与运算符: 当且仅当两个操作数都为真，条件才为真.
     * | |	逻辑或操作符: 如果任何两个操作数任何一个为真，条件为真.
     * ！	逻辑非运算符: 用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false.
     */
    @Test
    public void Test6() {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));
    }

    /**
     * 短路逻辑运算符
     * 当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，但是当得到第一个操作为false时，其结果就必定是false，
     * 这时候就不会再判断第二个操作了。
     */
    @Test
    public void Test7() {
        int a = 5;//定义一个变量；
        boolean b = (a < 4) && (a++ < 10);
        System.out.println("使用短路逻辑运算符的结果为" + b);
        System.out.println("a的结果为" + a);
    }

    /**
     * 赋值运算符
     * <p>
     * =	简单的赋值运算符，将右操作数的值赋给左侧操作数	C = A + B将把A + B得到的值赋给C
     * + =	加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数	C + = A等价于C = C + A
     * - =	减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数	C - = A等价于C = C - A
     * * =	乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数	C * = A等价于C = C * A
     * / =	除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数	C / = A，C 与 A 同类型时等价于 C = C / A
     * （％）=	取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数	C％= A等价于C = C％A
     * << =	左移位赋值运算符	C << = 2等价于C = C << 2
     * >> =	右移位赋值运算符	C >> = 2等价于C = C >> 2
     * ＆=	按位与赋值运算符	C＆= 2等价于C = C＆2
     * ^ =	按位异或赋值操作符	C ^ = 2等价于C = C ^ 2
     * | =	按位或赋值操作符	C | = 2等价于C = C | 2
     */
    @Test
    public void Test8() {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a  = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a  = " + c);
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c &= a;
        System.out.println("c &= a  = " + c);
        c ^= a;
        System.out.println("c ^= a   = " + c);
        c |= a;
        System.out.println("c |= a   = " + c);
    }

    /**
     * 条件运算符（?:）
     * 条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量.
     */
    @Test
    public void Test9() {
        int a, b;
        a = 10;
        // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b);
    }

    /**
     * instanceof 运算符
     * 该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。
     * <p>
     * instanceof运算符使用格式如下：
     * ( Object reference variable ) instanceof  (class/interface type)
     */
    @Test
    public void Test10() {
        String name = "James";
        boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
    }

    /**
     * Java运算符优先级
     * 当多个运算符出现在一个表达式中，谁先谁后呢？这就涉及到运算符的优先级别的问题。在一个多运算符的表达式中，运算符优先级不同会导致最后得出的结果差别甚大。
     * <p>
     * 例如，（1+3）＋（3+2）*2，这个表达式如果按加号最优先计算，答案就是 18，如果按照乘号最优先，答案则是 14。
     * <p>
     * 再如，x = 7 + 3 * 2;这里x得到13，而不是20，因为乘法运算符比加法运算符有较高的优先级，所以先计算3 * 2得到6，然后再加7。
     * <p>
     * 下表中具有最高优先级的运算符在的表的最上面，最低优先级的在表的底部。
     * <p>
     * 后缀	() [] . (点操作符)	左到右
     * 一元	+ + - ！〜	从右到左
     * 乘性 	* /％	左到右
     * 加性 	+ -	左到右
     * 移位 	>> >>>  << 	左到右
     * 关系 	>> = << = 	左到右
     * 相等 	==  !=	左到右
     * 按位与	＆	左到右
     * 按位异或	^	左到右
     * 按位或	|	左到右
     * 逻辑与	&&	左到右
     * 逻辑或	||	左到右
     * 条件	？：	从右到左
     * 赋值	= + = - = * = / =％= >> = << =＆= ^ = | =	从右到左
     * 逗号	，	左到右
     */
    @Test
    public void Test11() {
    }
}
