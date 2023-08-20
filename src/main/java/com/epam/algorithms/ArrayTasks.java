package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = {"winter", "spring", "summer", "autumn"};
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] array = new int[length];

        for (int i = 0; i < length;i++){
            array[i] = i+1;
        }

        return array;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int result = 0;

        for (int number : arr) {
            result += number;
        }

        return result;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == number)
                return i;

        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] reverseArray = new String[arr.length];

        for (int i = arr.length; i > 0; i--) {
            reverseArray[arr.length - i] = arr[i - 1];
        }

        return reverseArray;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int countOfPositiveNumbers = 0;

        for (int number : arr) {
            if (number > 0) {
                countOfPositiveNumbers++;
            }
        }

        int[] positiveArray = new int[countOfPositiveNumbers];
        int index = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveArray[index] = num;
                index++;
            }
        }

        return positiveArray;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int[] sortedLengths = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedLengths[i] = arr[i].length;
        }

        for (int i = 0; i < sortedLengths.length - 1; i++) {
            for (int j = 0; j < sortedLengths.length - i - 1; j++) {
                if (sortedLengths[j] > sortedLengths[j + 1]) {
                    int temp = sortedLengths[j];
                    sortedLengths[j] = sortedLengths[j + 1];
                    sortedLengths[j + 1] = temp;

                    int[] tempArray = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempArray;
                }
            }
        }

        int[][] result = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            result[i] = new int[arr[i].length];
            System.arraycopy(arr[i], 0, result[i], 0, arr[i].length);
        }

        return result;
    }

}
