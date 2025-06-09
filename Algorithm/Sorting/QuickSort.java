package Algorithm.Sorting;

import java.util.Random;

public class QuickSort {
    
    public static int partition(int[] arr, int low, int high) {
        int randomIndex = low + new Random().nextInt(high - low + 1);
        swap(arr, low, randomIndex);
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j)  swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }
    //  static int partition(int[] arr, int low, int high) {
    //     int pivot = arr[high];
    //     int i = low - 1;
    //     for (int j = low; j <= high - 1; j++) {
    //         if (arr[j] < pivot) {
    //             i++;
    //             swap(arr, i, j);
    //         }
    //     }
    //     swap(arr, i + 1, high);  
    //     return i + 1;
    // }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSorting(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSorting(arr, low, pi - 1);
            quickSorting(arr, pi + 1, high);
        }
    }

    public static int[] quickSort(int[] arr) {
        int n = arr.length;
        quickSorting(arr, 0, n - 1);
        return arr;
    }
}
