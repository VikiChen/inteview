package viki.inteview.sort.quickSort;

import java.util.Arrays;

/**
 * @author chenyf
 */
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        int i, j, tmp, t;
        if (low > high) {
            return;
        }

        i = low;
        j = high;
        tmp = arr[low];

        while (i < j) {
            while (tmp <= arr[j] && i < j) {
                j--;
            }
            arr[j] = arr[i];

            while (tmp >= arr[i] && i < j) {
                i++;
            }
            arr[i] = arr[j];

        }

        arr[i] = tmp;

        //递归调用左半数组
        quickSort(arr, low, j - 1);
        //递归调用右半数组
        quickSort(arr, j + 1, high);

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr ={111, 3, 5, 52, 74, 312, 75, 3, 764, 3, 2111, 7, 31};
        quickSort(arr,0,arr.length-1);
    }
}
