package edu.auburn.assignment2;

public class Finder {

    public static String findMax(int[] intArray) {

        // Return null in case the input array is null or empty.
        if (intArray == null || intArray.length == 0) {
            return null;
        }

        // Let's take the first element of the array as its max value...
        int max = intArray[0];

        // ...so the for loop start with the next one (i = 1).
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return Integer.toString(max);
    }

    public static String findMin(int[] intArray) {

        // Return null in case the input array is null or empty.
        if (intArray == null || intArray.length == 0) {
            return null;
        }

        // Let's take the first element of the array as its min value...
        int min = intArray[0];

        // ...so the for loop start with the next one (i = 1).
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        return Integer.toString(min);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 0, 2};

        System.out.print("Array: ");
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("The max value is: " + findMax(array));
        System.out.println("The min value is: " + findMin(array));
    }
}
