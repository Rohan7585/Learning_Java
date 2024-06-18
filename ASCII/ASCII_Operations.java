package ASCII;

import java.util.*;

public class ASCII_Operations{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a charcter: ");
        String str = n.nextLine();
        n.close();
        char ch = str.charAt(0);    //Taking character input

        System.out.print("The character: " + ch);
        int asc = ch;   //Copying the ASCII value of that character to another interger
        System.out.print("\nThe ASCII value: " + asc);    
        asc = asc + 32; //Updating that ASCII value
        char c = (char)asc; //Saving that updated character using updated ASCII value
        System.out.println("\nThe modified ASCII value: " + asc + " with result: " + c);
    }
}