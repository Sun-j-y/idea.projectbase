package JavaMaster.Sorts;

/**
 * @author Mateus Bizzo (https://github.com/MattBizzo)
 * @author Podshivalov Nikita (https://github.com/nikitap492)
 */

/**
 * 鸡尾酒排序，也就是定向冒泡排序，鸡尾酒搅拌排序，搅拌排序（也可以视作选择排序的一种变形），
 * 涟漪排序，来回排序或快乐小时排序，是冒泡排序的一种变形。
 * 此算法与冒泡排序的不同处在于排序时是以双向在序列中进行排序。
 **/
class CocktailShakerSort implements SortAlgorithm {

    /**
     * This method implements the Generic Cocktail Shaker Sort
     *
     * @param array The array to be sorted
     *              Sorts the array in increasing order
     **/

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {

        int length = array.length;
        int left = 0;
        int right = length - 1;
        int swappedLeft, swappedRight;
        while (left < right) {
            // front
            swappedRight = 0;
            for (int i = left; i < right; i++) {
                if (SortUtils.less(array[i + 1], array[i])) {
                    SortUtils.swap(array, i, i + 1);
                    swappedRight = i;
                }
            }
            // back
            right = swappedRight;
            swappedLeft = length - 1;
            for (int j = right; j > left; j--) {
                if (SortUtils.less(array[j], array[j - 1])) {
                    SortUtils.swap(array, j - 1, j);
                    swappedLeft = j;
                }
            }
            left = swappedLeft;
        }
        return array;

    }

    // Driver Program
    public static void main(String[] args) {
        // Integer Input
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        CocktailShakerSort shakerSort = new CocktailShakerSort();

        // Output => 1 4 6 9 12 23 54 78 231
        SortUtils.print(shakerSort.sort(integers));

        // String Input
        String[] strings = {"c", "a", "e", "b", "d"};
        SortUtils.print(shakerSort.sort(strings));
    }


}
