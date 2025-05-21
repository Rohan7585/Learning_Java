package Algorithm.Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        if (arr == null) {
            System.out.println("Array is null. Nothing to sort.");
            return;
        }
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)   break;
        }
    }
}
