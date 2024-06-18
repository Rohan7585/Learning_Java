package String;
/**
 * String Basics
 */
public class String_Basics {

    public static void main(String[] args){
        String str1 = "hello, world!";  //String Literal:
        String str2 = new String("Hello, World!");  //Using the new Keyword
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        //Length of a String:
        int length = str1.length(); // Returns the length of the string
        System.out.println("\nLenght = " + length);

        //Character at a Specific Index:
        char ch = str1.charAt(0); // Returns 'h'
        System.out.println("\nCharacter at the index 0: " + ch);

        //Substrings:
        String substr = str1.substring(7); // Returns "world!"
        String substr2 = str1.substring(7, 12); // Returns "world"
        System.out.println("\nSubstring from index value of 7: " + substr + "and 2nd substring: " + substr2);

        //Concatenation:
        String str3 = str1 + " How are you?"; // Using the + operator
        String str4 = str1.concat(" How are you?"); // Using the concat method
        System.out.println("\nBasic Concatination: " + str3 + " Concatination using concat(): " + str4);

        //Equality:
        boolean isEqual = str1.equals(str2); // Compares the content of strings
        System.out.println("\nString1 is equal to String2: " + isEqual);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // Compares ignoring case
        System.out.println("String1 is equal to String2 ignoring case: " + isEqualIgnoreCase);

        //Contains:
        boolean contains = str1.contains("World"); // Returns false
        System.out.println("\nContaining the word 'World': " + contains);

        //Index of a Character or Substring:
        int index = str1.indexOf('W'); // Returns -1
        System.out.println("\nIndex of 'W': " + index);
        int index2 = str1.indexOf("world"); // Returns 7
        System.out.println("Index of 'world': " + index2);
        /*
        int indexOf(int ch) - Returns the index of the first occurrence of the specified character.
        int indexOf(int ch, int fromIndex) - Returns the index of the first occurrence of the specified character, starting the search at the specified index.
        int indexOf(String str) - Returns the index of the first occurrence of the specified substring.
        int indexOf(String str, int fromIndex) - Returns the index of the first occurrence of the specified substring, starting the search at the specified index.
         */

        //Replacing Characters or Substrings:
        String replacedStr = str1.replace('o', 'a'); // Replaces 'o' with 'a'
        System.out.println("\nReplace o with a: " + replacedStr);
        String replacedStr2 = str1.replace("World", "Java"); // Replaces "World" with "Java"
        System.out.println("Replace World with Java: " + replacedStr2);

        //Splitting Strings:
        String[] parts = str1.split(", "); // Splits the string by ", "
        System.out.println("\nSplit: " + parts);

        //Trim:
        String str = "  Hello  ";
        System.out.println("\nBefore trim: " + str);
        String trimmedStr = str.trim(); // Removes leading and trailing whitespace
        System.out.println("After trim: " + trimmedStr);

        //Converts all characters in the string to lowercase
        String lowerStr = str2.toLowerCase();
        System.out.println("\ntoLowerCase: " + lowerStr);

        //Converts all characters in the string to uppercase
        String upperStr = str1.toUpperCase();
        System.out.println("\ntoUpperCase: " + upperStr);
    }
}