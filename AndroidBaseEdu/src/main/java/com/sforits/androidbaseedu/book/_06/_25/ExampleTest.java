package com.sforits.androidbaseedu.book._06._25;

import java.util.ArrayList;
import java.util.Collections;

public class ExampleTest {
    /*
     * 工具类Collections
     *      用于对list集合进行添加和排序操作
     * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "a", "c", "b");
        System.out.println("排序前: " + list);
        Collections.reverse(list); // 反转
        System.out.println("反转后: " + list);
        Collections.sort(list);  // 自然排序
        System.out.println("自然排序: " + list);
        Collections.shuffle(list);  // 随机排序
        System.out.println("随机排序" + list);
        Collections.swap(list, 0, list.size() - 1);  // 首尾元素叫画面
        System.out.println("首尾交换: " + list);
    }
}
