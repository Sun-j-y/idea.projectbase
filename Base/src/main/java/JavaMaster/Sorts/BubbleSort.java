package JavaMaster.Sorts;

import static JavaMaster.Sorts.SortUtils.*;
//import static Sorts.SortUtils.*;

/**
 * @author Varun Upadhyay (https://github.com/varunu28)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see SortAlgorithm
 */

/**
 * 冒泡排序（英语：Bubble Sort）又称为泡式排序，是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，
 * 如果他们的顺序错误就把他们交换过来。走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 * <p>
 * 冒泡排序对{\displaystyle n}n个项目需要O({\displaystyle n^{2}}n^{2})的比较次数，且可以原地排序。
 * 尽管这个算法是最简单了解和实现的排序算法之一，但它对于包含大量的元素的数列排序是很没有效率的。
 * <p>
 * 冒泡排序是与插入排序拥有相等的运行时间，但是两种算法在需要的交换次数却很大地不同。在最坏的情况，
 * 冒泡排序需要{\displaystyle O(n^{2})}O(n^{2})次交换，而插入排序只要最多{\displaystyle O(n)}O(n)交换。
 * 冒泡排序的实现（类似下面）通常会对已经排序好的数列拙劣地运行（{\displaystyle O(n^{2})}O(n^{2})），
 * 而插入排序在这个例子只需要{\displaystyle O(n)}O(n)个运算。因此很多现代的算法教科书避免使用冒泡排序，而用插入排序取代之。
 * 冒泡排序如果能在内部循环第一次运行时，使用一个旗标来表示有无需要交换的可能，也可以把最优情况下的复杂度降低到{\displaystyle O(n)}O(n)。
 * 在这个情况，已经排序好的数列就无交换的需要。若在每次走访数列时，把走访顺序反过来，也可以稍微地改进效率。有时候称为鸡尾酒排序，
 * 因为算法会从数列的一端到另一端之间穿梭往返。
 * <p>
 * 冒泡排序算法的运作如下：
 * <p>
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * 由于它的简洁，冒泡排序通常被用来对于程序设计入门的学生介绍算法的概念。
 **/

class BubbleSort implements SortAlgorithm {
    /**
     * This method implements the Generic Bubble Sort
     *
     * @param array The array to be sorted
     *              Sorts the array in increasing order
     **/

    @Override
    public <T extends Comparable<T>> T[] sort(T array[]) {
        for (int i = 0, size = array.length; i < size - 1; ++i) {
            boolean swapped = false;
            for (int j = 0; j < size - 1 - i; ++j) {
                swapped = less(array[j], array[j + 1]) && swap(array, j, j + 1);
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }

    // Driver Program
    public static void main(String[] args) {

        // Integer Input
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(integers);

        // Output => 231, 78, 54, 23, 12, 9, 6, 4, 1
        print(integers);

        // String Input
        String[] strings = {"c", "a", "e", "b", "d"};
        //Output => e, d, c, b, a
        print(bubbleSort.sort(strings));

    }
}
