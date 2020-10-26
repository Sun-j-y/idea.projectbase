package JavaMaster.Sorts;

import java.util.Random;

/**
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 * @see SortAlgorithm
 **/
public class BogoSort implements SortAlgorithm {
    /**
     * Bogo排序（bogo-sort）是个既不实用又原始的排序算法，其原理等同将一堆卡片抛起，落在桌上后检查卡片是否已整齐排列好，
     * 若非就再抛一次。其名字源自Quantum bogodynamics，又称bozo sort、blort sort或猴子排序（参见无限猴子定理）。
     **/
    private static final Random random = new Random();


    private static <T extends Comparable<T>> boolean isSorted(T array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            if (SortUtils.less(array[i + 1], array[i])) return false;
        }
        return true;
    }

    // Randomly shuffles the array
    private static <T> void nextPermutation(T array[]) {
        int length = array.length;

        for (int i = 0; i < array.length; i++) {
            int randomIndex = i + random.nextInt(length - i);
            SortUtils.swap(array, randomIndex, i);
        }
    }

    public <T extends Comparable<T>> T[] sort(T array[]) {
        while (!isSorted(array)) {
            nextPermutation(array);
        }
        return array;
    }

    // Driver Program
    public static void main(String[] args) {
        // Integer Input
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};

        BogoSort bogoSort = new BogoSort();

        // print a sorted array
        SortUtils.print(bogoSort.sort(integers));

        // String Input
        String[] strings = {"c", "a", "e", "b", "d"};

        SortUtils.print(bogoSort.sort(strings));
    }
}
