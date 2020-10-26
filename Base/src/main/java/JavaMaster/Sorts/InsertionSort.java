package JavaMaster.Sorts;

import static JavaMaster.Sorts.SortUtils.*;
//import static Sorts.SortUtils.less;
//import static Sorts.SortUtils.print;

/**
 * @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 */

/*
* 插入排序（英语：Insertion Sort）是一种简单直观的排序算法。它的工作原理是通过构建有序序列，对于未排序数据，
* 在已排序序列中从后向前扫描，找到相应位置并插入。插入排序在实现上，
* 通常采用in-place排序（即只需用到{\displaystyle O(1)}{\displaystyle O(1)}的额外空间的排序），因而在从后向前扫描过程中，
* 需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
* */
class InsertionSort implements SortAlgorithm {

    /**
     * This method implements the Generic Insertion Sort
     * Sorts the array in increasing order
     *
     * @param array The array to be sorted
     **/

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int j = 1; j < array.length; j++) {

            // Picking up the key(Card)
            T key = array[j];
            int i = j - 1;

            while (i >= 0 && less(key, array[i])) {
                array[i + 1] = array[i];
                i--;
            }
            // Placing the key (Card) at its correct position in the sorted subarray
            array[i + 1] = key;
        }
        return array;
    }

    // Driver Program
    public static void main(String[] args) {
        // Integer Input
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};

        InsertionSort sort = new InsertionSort();

        sort.sort(integers);

        // Output => 1 4 6 9 12 23 54 78 231
        print(integers);

        // String Input
        String[] strings = {"c", "a", "e", "b", "d"};

        sort.sort(strings);

        //Output => a	b	c	d	e
        print(strings);
    }
}
