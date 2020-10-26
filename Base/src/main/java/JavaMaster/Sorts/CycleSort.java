package JavaMaster.Sorts;

import static JavaMaster.Sorts.SortUtils.*;
//import static Sorts.SortUtils.less;
//import static Sorts.SortUtils.print;

/**
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 */

/**
 * 循环排序是一种就地，不稳定的 排序算法，这是一种比较排序，在理论上，对原始数组的总写入数是最佳的，这不同于其他任何就地排序算法。
 * 基于这样的思想，可以将要排序的排列分解为周期，可以将其单独旋转以给出排序的结果。
 * 与几乎其他所有类型不同，项目永远不会被写入数组中的其他位置，而只是将它们推到操作之外。如果每个值已经处于正确位置，则将其写入零次，
 * 或者将其写入一次至正确位置。这与完成就地排序所需的最少重写次数相匹配。
 * 最大限度地减少写入次数进行写入一些巨大的数据集时是很有用的是非常昂贵的，如用EEPROM的像闪存，其中每个写减少了内存的使用寿命。
 **/
class CycleSort implements SortAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr) {
        int n = arr.length;

        // traverse array elements
        for (int j = 0; j <= n - 2; j++) {
            // initialize item as starting point
            T item = arr[j];

            // Find position where we put the item.
            int pos = j;
            for (int i = j + 1; i < n; i++)
                if (less(arr[i], item)) pos++;

            // If item is already in correct position
            if (pos == j) continue;

            // ignore all duplicate elements
            while (item.compareTo(arr[pos]) == 0)
                pos += 1;

            // put the item to it's right position
            if (pos != j) {
                item = replace(arr, pos, item);
            }

            // Rotate rest of the cycle
            while (pos != j) {
                pos = j;

                // Find position where we put the element
                for (int i = j + 1; i < n; i++)
                    if (less(arr[i], item)) {
                        pos += 1;
                    }


                // ignore all duplicate elements
                while (item.compareTo(arr[pos]) == 0)
                    pos += 1;

                // put the item to it's right position
                if (item != arr[pos]) {
                    item = replace(arr, pos, item);
                }
            }
        }

        return arr;
    }

    private <T extends Comparable<T>> T replace(T[] arr, int pos, T item) {
        T temp = item;
        item = arr[pos];
        arr[pos] = temp;
        return item;
    }


    public static void main(String[] args) {
        Integer arr[] = {4, 23, 6, 78, 1, 26, 11, 23, 0, -6, 3, 54, 231, 9, 12};
        CycleSort cycleSort = new CycleSort();
        cycleSort.sort(arr);

        System.out.println("After sort : ");
        print(arr);
    }

}
