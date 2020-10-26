package JavaMaster.Sorts;

import static JavaMaster.Sorts.SortUtils.*;
//import static Sorts.SortUtils.*;

/**
 * @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see SortAlgorithm
 */

/*
* 快速排序（英语：Quicksort），又称划分交换排序（partition-exchange sort），简称快排，一种排序算法，最早由东尼·霍尔提出。
* 在平均状况下，排序{\displaystyle n}n个项目要{\displaystyle \ O(n\log n)}{\displaystyle \ O(n\log n)}（大O符号）次比较。
* 在最坏状况下则需要{\displaystyle O(n^{2})}{\displaystyle O(n^{2})}次比较，但这种状况并不常见。事实上，
* 快速排序{\displaystyle \Theta (n\log n)}{\displaystyle \Theta (n\log n)}通常明显比其他算法更快，
* 因为它的内部循环（inner loop）可以在大部分的架构上很有效率地达成。
* */
class QuickSort implements SortAlgorithm {

    /**
     * This method implements the Generic Quick Sort
     *
     * @param array The array to be sorted
     *              Sorts the array in increasing order
     **/

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        doSort(array, 0, array.length - 1);
        return array;
    }


    /**
     * The sorting process
     *
     * @param left  The first index of an array
     * @param right The last index of an array
     * @param array The array to be sorted
     **/

    private static <T extends Comparable<T>> void doSort(T[] array, int left, int right) {
        if (left < right) {
            int pivot = randomPartition(array, left, right);
            doSort(array, left, pivot - 1);
            doSort(array, pivot, right);
        }
    }

    /**
     * Ramdomize the array to avoid the basically ordered sequences
     * 
     * @param array The array to be sorted
     * @param left  The first index of an array
     * @param right The last index of an array
     * @return the partition index of the array
     */

    private static <T extends Comparable<T>> int randomPartition(T[] array, int left, int right) {
        int randomIndex = left + (int)(Math.random()*(right - left + 1));
        swap(array, randomIndex, right);
        return partition(array, left, right);
    }

    /**
     * This method finds the partition index for an array
     *
     * @param array The array to be sorted
     * @param left  The first index of an array
     * @param right The last index of an array
     *              Finds the partition index of an array
     **/

    private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
        int mid = (left + right) / 2;
        T pivot = array[mid];

        while (left <= right) {
            while (less(array[left], pivot)) {
                ++left;
            }
            while (less(pivot, array[right])) {
                --right;
            }
            if (left <= right) {
                swap(array, left, right);
                ++left;
                --right;
            }
        }
        return left;
    }

    // Driver Program
    public static void main(String[] args) {

        // For integer input
        Integer[] array = {3, 4, 1, 32, 0, 1, 5, 12, 2, 5, 7, 8, 9, 2, 44, 111, 5};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);

        //Output => 0 1 1 2 2 3 4 5 5 5 7 8 9 12 32 44 111
        print(array);

        String[] stringArray = {"c", "a", "e", "b", "d"};
        quickSort.sort(stringArray);

        //Output => a	b	c	d	e
        print(stringArray);
    }
}

