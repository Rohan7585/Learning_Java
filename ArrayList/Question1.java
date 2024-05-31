package ArrayList;
//Check if ArrayList Is Sorted and Rotated

import java.util.ArrayList;

public class Question1{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(22);
        arr.add(25);
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(9);

        int count=0;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)>arr.get((i+1)%arr.size()))  count++;
        }
        if(count>1) System.out.println("This ArrayList is not sorted and rotated.");
        else if(count == 1) System.out.println("This ArrayList is sorted and rotated.");
        else    System.out.println("This ArrayList is sorted but not rotated.");
    }
}
