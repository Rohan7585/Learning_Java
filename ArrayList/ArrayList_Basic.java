package ArrayList;

import java.util.ArrayList;

public class ArrayList_Basic{
    public static void main(String[] args){
        System.out.println("\t---ArrayList---");

        // Creating an ArrayList
        ArrayList<Integer> AL_1 = new ArrayList<>();
    
        // Adding elements to the ArrayList using add()
        AL_1.add(10);
        AL_1.add(20);
        AL_1.add(30);
        AL_1.add(40);
        AL_1.add(50);
        AL_1.add(60);
        AL_1.add(70);

        // Print ArrayList
        System.out.println("\nPrinting ArrayList: ");
        System.out.print(AL_1);

        // Print ArrayList using iteration
        System.out.println("\n\nPrint using each for loop");
        for(int ele:AL_1) {
        System.out.print(ele + " ");
        }

        // Getting the size of the ArrayList using size() method
        int size = AL_1.size();
        System.out.println("\n\nSize of the ArrayList: " + size);

        // Checking if the ArrayList is empty or not using isEmpty()
        boolean isEmpty = AL_1.isEmpty();
        System.out.println("\nThis ArrayList is empty: " + isEmpty);

        // Accessing an element by index using get()
        int elementAtIndex = AL_1.get(1);
        System.out.println("\nElement at index 1: " + elementAtIndex);

        // Modifying an element using set()
        AL_1.set(2, 100);
        System.out.print("\nAfter modifying, Elements in the ArrayList: ");
        for (int element : AL_1) {
            System.out.print(element+ " ");
        }

        // Removing an element by index
        AL_1.remove(3);
        System.out.print("\n\nAfter removing, Elements in the ArrayList:");
        for (int element : AL_1) {
            System.out.print(element+ " ");
        }

        // Removing an element with the element value
        AL_1.remove(Integer.valueOf(100));
        System.out.print("\n\nAfter removing 100 from the ArrayList: ");
        for (int element : AL_1) {
            System.out.print(element+ " ");
        }

        // Clearing the ArrayList using clear()
        AL_1.clear();
        System.out.print("\n\nAfter clearing, Elements in the ArrayList: ");
        for (int element : AL_1) {
            System.out.print(element+" ");
        }
        
        // Adding an element at a specific index using add(index, element)
        AL_1.add(0, 500);
        System.out.print("\n\nAfter adding, Elements in the ArrayList: ");
        for (int element : AL_1) {
            System.out.print(element+" ");
        }
    }
}
