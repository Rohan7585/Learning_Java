package ASCII;

import java.util.*;

public class ASCII_Operations{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a charcter: ");
        String str = n.nextLine();
        n.close();
        char ch = str.charAt(0);
        System.out.print("The character: " + ch);
        int asc = ch;
        System.out.println("\nThe ASCII value: " + asc);
        asc = asc + 32;
        System.out.println("\nThe modified ASCII value: " + asc + " with result: " + (char)asc);
    }
}