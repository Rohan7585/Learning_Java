package Algorithm.Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void mergeSort(int[] nums) {
        mergeDivider(nums, 0, nums.length-1);
    }

    private static void mergeDivider(int[] arr, int left, int right){
        if(left>=right)    return;
        int mid = left + (right - left)/2;
        mergeDivider(arr, left, mid);
        mergeDivider(arr, mid+1, right);
        merger(arr, left, mid, right);
    }

    private static void merger(int[] arr, int left, int mid, int right){
        int leftPointer = left;
        int rightPointer = mid+1;
        List<Integer> arrL = new ArrayList<>();
        while(left<=mid && mid+1<=right && leftPointer<=mid && rightPointer<=right){
            if(arr[leftPointer]>arr[rightPointer]){
                arrL.add(arr[rightPointer]);
                rightPointer++;
            }else{
                arrL.add(arr[leftPointer]);
                leftPointer++;
            }
        }
        while(leftPointer<=mid){
            arrL.add(arr[leftPointer]);
            leftPointer++;
        }
        while(rightPointer<=right){
            arrL.add(arr[rightPointer]);
            rightPointer++;
        }
        for(int i=left; i<=right; i++){
            arr[i] = arrL.get(i-left);
        }
    }
}

