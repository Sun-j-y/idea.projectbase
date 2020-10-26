package JavaMaster.Sorts;

/**
 * @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see SortAlgorithm
 */

/*
* 选择排序（Selection sort）是一种简单直观的排序算法。它的工作原理如下。首先在未排序序列中找到最小（大）元素，
* 存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
* 以此类推，直到所有元素均排序完毕。
*
* 选择排序的主要优点与数据移动有关。如果某个元素位于正确的最终位置上，则它不会被移动。选择排序每次交换一对元素，
* 它们当中至少有一个将被移到其最终位置上，因此对{\displaystyle n}n个元素的表进行排序总共进行至多{\displaystyle n-1}{\displaystyle n-1}次交换。
* 在所有的完全依靠交换去移动元素的排序方法中，选择排序属于非常好的一种。
*
* */
public class SelectionSort implements SortAlgorithm {

    /**
     * This method implements the Generic Selection Sort
     *
     * @param arr The array to be sorted
     *            Sorts the array in increasing order
     **/
    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Initial index of min
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (SortUtils.less(arr[j], arr[min])) {
                    min = j;
                }
            }

            // Swapping if index of min is changed
            if (min != i) {
                SortUtils.swap(arr, i, min);
            }
        }

        return arr;
    }

    // Driver Program
    public static void main(String[] args) {

        Integer[] arr = {4, 23, 6, 78, 1, 54, 231, 9, 12};

        SelectionSort selectionSort = new SelectionSort();

        Integer[] sorted = selectionSort.sort(arr);

        // Output => 1	  4	 6	9	12	23	54	78	231
        SortUtils.print(sorted);

        // String Input
        String[] strings = {"c", "a", "e", "b", "d"};
        String[] sortedStrings = selectionSort.sort(strings);

        //Output => a	b	 c  d	e
        SortUtils.print(sortedStrings);
    }
}
