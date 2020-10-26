package JavaMaster.Sorts;

import static JavaMaster.Sorts.SortUtils.*;
//import static Sorts.SortUtils.*;


/**
 * Comb Sort algorithm implementation
 * <p>
 * Best-case performance O(n * log(n))
 * Worst-case performance O(n ^ 2)
 * Worst-case space complexity O(1)
 * <p>
 * Comb sort improves on bubble sort.
 *
 * @author Sandeep Roy (https://github.com/sandeeproy99)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see BubbleSort
 * @see SortAlgorithm
 */

/*
* 梳排序（Comb sort）是一種由Wlodzimierz Dobosiewicz於1980年所發明的不穩定排序算法，
* 並由Stephen Lacey和Richard Box於1991年四月號的Byte雜誌中推廣。梳排序是改良自泡沫排序和快速排序，其要旨在於消除烏龜，
* 亦即在陣列尾部的小數值，這些數值是造成泡沫排序緩慢的主因。相對地，兔子，亦即在陣列前端的大數值，不影響泡沫排序的效能。
* 在泡沫排序中，只比較陣列中相鄰的二項，即比較的二項的間距（Gap）是1，梳排序提出此間距其實可大於1，
* 改自插入排序的希爾排序同樣提出相同觀點。梳排序中，開始時的間距設定為陣列長度，並在迴圈中以固定比率遞減，通常遞減率設定為1.3。
* 在一次迴圈中，梳排序如同泡沫排序一樣把陣列從首到尾掃描一次，比較及交換兩項，不同的是兩項的間距不固定於1。如果間距遞減至1，
* 梳排序假定輸入陣列大致排序好，並以泡沫排序作最後檢查及修正。
* */
class CombSort implements SortAlgorithm {

    // To find gap between elements
    private int nextGap(int gap) {
        // Shrink gap by Shrink factor
        gap = (gap * 10) / 13;
        return (gap < 1) ? 1 : gap;
    }

    /**
     * Function to sort arr[] using Comb
     *
     * @param arr - an array should be sorted
     * @return sorted array
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T arr[]) {
        int size = arr.length;

        // initialize gap
        int gap = size;

        // Initialize swapped as true to make sure that loop runs
        boolean swapped = true;

        // Keep running while gap is more than 1 and last iteration caused a swap
        while (gap != 1 || swapped) {
            // Find next gap
            gap = nextGap(gap);

            // Initialize swapped as false so that we can check if swap happened or not
            swapped = false;

            // Compare all elements with current gap
            for (int i = 0; i < size - gap; i++) {
                if (less(arr[i + gap], arr[i])) {
                    // Swap arr[i] and arr[i+gap]
                    swapped = swap(arr, i, i + gap);
                }
            }
        }
        return arr;
    }

    // Driver method
    public static void main(String args[]) {
        CombSort ob = new CombSort();
        Integer arr[] = {8, 4, 1, 56, 3, -44, -1, 0, 36, 34, 8, 12, -66, -78, 23, -6, 28, 0};
        ob.sort(arr);

        System.out.println("sorted array");
        print(arr);
    }
}
