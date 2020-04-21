package tms.qa05.lec_3.classwork.point_3;

import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arrayToSort = {0, 1, 4, 0};
        /*
        3
        2
        1
         */

        System.out.println(Arrays.toString(arrayToSort));

        int[] arrayToSort_2 = {88, 77, 44};

        sort(arrayToSort);
        sort(arrayToSort_2);

        System.out.println("==After sort==");
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println(Arrays.toString(arrayToSort_2));
    }

    public static void sort(int[] array) {
        boolean needToSort = true;
        while (needToSort) {
            needToSort = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);

                    needToSort = true;
                }
            }
        }
    }

    public static void swap(int[] array, int left, int right) {
        int tmp = array[right];
        array[right] = array[left];
        array[left] = tmp;
    }

    /*
    1. пойти в ванну
    2. взщять щетку
    3. взять пасту
    4. начать чистку
     */
}
