package Bases._2_BasicConcepts;

/*
 *  观察boolean型数据
 * */
public class _18_boolean {
    public static void main(String[] args) {
        boolean flag=false; // boolean只有两种取值: true false
        if(!flag) {  // if(布尔值){ 满足条件的操作 }
            System.out.println("Hello World!");
        }
        /*
        *   布尔型大多数情况下用于逻辑控制
        *       许多语言中, 由于设计初期没有考虑到布尔型的问题, 使用了数字0表示false, 非0数字表示true
        *       这样的设计对于代码开发比较混乱
        *   Java中不允许使用0/1表示来填充布尔型变量内容
        * */
    }
}
