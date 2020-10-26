package Bases._2_BasicConcepts;//package Bases._2_BasicConcepts;
//
//public class _17_char {
//    /*
//     * byte属于字节, 按照传统观念: 1字符 = 2字节
//     * Java使用的是十六进制的 unicode 编码, 此编码包含 ASCII 的部分编码
//     *      ASCII编码:
//     *          大写字母范围: 65 - 96
//     *          小写字母范围: 97 - 122
//     * */
//    public static void main(String[] args) {
//        char c = 'A';   // 字符
//        int num = c;    // 字符可以和int型互相转换(一编码形式)
//        System.out.println(c);      // A
//        System.out.println(num);    // 65
//        /*
//         * 可得出以下常用编码范围
//         *   A(65) - Z(96)
//         *   a(97) - z(122)
//         *   0(48) - 9(57)
//         * */
//
//        /*
//         * 实现字母大小写转换
//         * */
//        char c2 = (char) (num + 32);
//        System.out.println(c2);
//        // 需要将char转换为int才能进行加法等运算
//        /*
//         * 利用字符变量保存中文
//         * */
//        char c3 = '网';
//        System.out.println(c3);
//        System.out.println((int) c3);
//        // 可见每一个中文在Java中都有对应的unicode编码
//    }
//}
