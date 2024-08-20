package Array;
class Array_Basics{
    public static void main(String[] Args){

        //Declaring an Array
        int[] numbers1;
        String[] names1;

        //Creating an Array: After declaring an array, you must create it with the new keyword and specify its size
        numbers1 = new int[5];
        names1 = new String[10];

        //You can also declare and create an array in one line
        int[] numbers2 = new int[5];
        String[] names2 = new String[10];   

        //Initializing an Array
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};

        //Accessing Array Elements
        int firstNumber = numbers[0];
        String firstName = names[0];

        //Modifying Array Elements
        numbers[0] = 10;
        names[0] = "Alex";
        
        //Array Length
        int numberOfElements = numbers.length;

        //Iterating Over an Array
        // Using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Using a for-each loop
        for (int number : numbers) {
            System.out.println(number);
        }

        //Multidimensional Arrays
        int[][] matrix1 = new int[3][3];

        // Initializing a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing elements
        int element = matrix[1][2];  // 6

        // Iterating over a 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

    }
}