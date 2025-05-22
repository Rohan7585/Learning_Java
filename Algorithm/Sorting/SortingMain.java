package Algorithm.Sorting;

import java.util.Arrays;

public class SortingMain {
    public static void main(String[] args){
        int[] arr1 = {12,4,2,65,324,32,145,663,1,66,45,36,3,4,23,534,543,5,3};
        int[] arr2 = {2,42,523,524,253,346,64,3,53,523,2,5,25,2,5,5,2,34,6,34,64,4,25,26,2};
        int[] arr3 = {2,43,354,6543,2,643,35,13,325,2,25,23,52,6,25,23,52,3,2,6,5,26,25,235,2};
        int[] arr4 = {3,3,54,23,52,34,634,6,3,6356,34,35,656,346,36,4,6346,36,346,346,36,34,6};
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));

        BubbleSort.bubbleSort(arr1);
        System.out.println("\nBubble Sort on arr1 = " + Arrays.toString(arr1));
        InsertionSort.insertionSort(arr2);
        System.out.println("\nInsertion Sort on arr2 = " + Arrays.toString(arr2));
        SelectionSort.selectionSort(arr3);
        System.out.println("\nSelection Sort on arr3 = " + Arrays.toString(arr3));
        MergeSort.mergeSort(arr4);
        System.out.println("\nMerge Sort on arr4 = " + Arrays.toString(arr4));
    }
}
