package JavaMaster.Sorts;

import static JavaMaster.Sorts.SortUtils.*;
//import static Sorts.SortUtils.*;

/**
 * Implementation of gnome sort
 *
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @since 2018-04-10
 **/

/*
 * 煎饼排序（英语：Pancake sorting）指的是将大小不同的一摞煎饼按大小排序的数学问题，
 * 其中煎饼铲子每次只能从任意位置铲起上方全部煎饼并翻面。“煎饼数”（英语：pancake number）是指给定煎饼的张数时，
 * 最坏情况下需要的最少翻面次数。这个问题最早由美国几何学家雅可比·古德曼提出。[1]它属于排序问题的变种。
 * 煎饼排序的目标和传统排序算法最小化比较次数不同，因为它每次操作只允许反转序列的前缀，所以需要最小化反转前缀次数。
 * 焦煎饼排序是煎饼排序的变种问题，每张煎饼都有一面是烤焦的，最终除了按照大小排序以外还要让所有焦面向下。
 * */
public class PancakeSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            T max = array[0];
            int index = 0;
            for (int j = 0; j < size - i; j++) {
                if (less(max, array[j])) {
                    max = array[j];
                    index = j;
                }
            }
            flip(array, index, array.length - 1 - i);
        }
        return array;
    }


    public static void main(String[] args) {

        Integer[] arr = {10, 9, 8, 7, 6, 15, 14, 7, 4, 3, 8, 6, 3, 1, 2, -2, -5, -8, -3, -1, 13, 12, 11, 5, 4, 3, 2, 1};
        PancakeSort pancakeSort = new PancakeSort();
        System.out.println("After sorting:");
        pancakeSort.sort(arr);
        print(arr);
    }


}
