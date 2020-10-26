package Bases._2_BasicConcepts;

public class _13 {
    /*
     * 定义变量是不设置内容, 使用变量前设置内容
     * */
    public static void main(String[] args) {
        int num;                // 没有默认值
        num = 0;                // 使用此变量前设置内容
        System.out.println(num);
    }
    /*
    * 注:
    *   虽然在Java中每个变量都有默认值, 但是这些默认值不是在任何情况下都能使用,(例如: 方法中必须设置变量内容,
    *   类中可以使用各个数据类型的默认值)
    *   JDK1.5以后允许声明变量时不设置内容, 但要求使用变量前设置内容
    * */
}
