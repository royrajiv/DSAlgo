package Sorting;

import java.util.Arrays;

public class InsertionSort {

/*
The iteration starts on the second element (the first one is by default considered sorted),
and compares the first element of the unsorted array with the last element of the sorted array.

The unsorted element is "safe-kept" in the variable current
and if the highest element in the sorted array is bigger than the current variable
- the adequate portion of the sorted array is shifted to the right.

Please note that they're not swapped, it's shifted to the right and now both array[j] (accessed through array[i+1]) and array[i] hold the same value.
Then, regardless of whether a portion of the sorted array is shifted to the right,
we set the array[j] to current, effectively inserting the safe-kept integer into its right place.

If the current element isn't smaller than the biggest sorted element (i.e. it's bigger),
it's simply inserted at the end where it belongs.
*/

    public static void insertionSort(int array[]) {
        for (int j = 1; j < array.length; j++) {
            int current = array[j];
            System.out.print("   current = " + current);
            int i = j - 1;
            while ((i > -1) && (array[i] > current)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = current;
        }
    }

    public static void main(String args[]) {
        int[] array = new int[]{1, 7, 5, 6, 9, 4, 2, 3};
        System.out.println("Before Sorting " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("");
        System.out.println("After Sorting " + Arrays.toString(array));
    }
}
