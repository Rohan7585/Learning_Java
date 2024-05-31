package Array;
//Check if Array Is Sorted and Rotated

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args){
        int n;
        System.out.print("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values for array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("The array you entered is sorted: "+ isSorted(arr));
    }

    public static boolean isSorted(int[] arr){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[(i+1)%arr.length])    count++;
        }
        return count<=1;
    }
}
