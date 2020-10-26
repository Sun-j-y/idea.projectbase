package JavaMaster.Sorts;

import static JavaMaster.Sorts.SortUtils.*;
//import static Sorts.SortUtils.*;


/**
 * @author dpunosevac
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see SortAlgorithm
 */

/**
 * 希尔排序（Shellsort），也称递减增量排序算法，是插入排序的一种更高效的改进版本。希尔排序是非稳定排序算法。
 * <p>
 * 希尔排序是基于插入排序的以下两点性质而提出改进方法的：
 * <p>
 * 插入排序在对几乎已经排好序的数据操作时，效率高，即可以达到线性排序的效率
 * 但插入排序一般来说是低效的，因为插入排序每次只能将数据移动一位
 **/
public class ShellSort implements SortAlgorithm {

    /**
     * This method implements Generic Shell Sort.
     *
     * @param array The array to be sorted
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int N = array.length;
        int h = 1;

        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(array[j], array[j - h]); j -= h) {
                    swap(array, j, j - h);
                }
            }

            h /= 3;
        }

        return array;
    }

    public static void main(String[] args) {
        Integer[] toSort = {4, 23, 6, 78, 1, 54, 231, 9, 12};

        ShellSort sort = new ShellSort();
        Integer[] sorted = sort.sort(toSort);

        print(sorted);

    }
}
