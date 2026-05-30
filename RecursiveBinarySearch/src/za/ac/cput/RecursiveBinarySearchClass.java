package za.ac.cput;

public class RecursiveBinarySearchClass {

    public static int recursiveBinarySearch(int[] array, int start, int end, int target) {
        int middle = (start + end) / 2; // these are indexes.

        // base case: check if the element is present at the middle itself
        if (target == array[middle]) {
            return middle;
        }

        if (end < start) // base case: check if we've run out of elements
        {
            return -1; // not found
        }

        // recursive call: search start to middle.
        // If element is smaller than mid, then it can only be present in left subarray
        if (target < array[middle]) {
            return recursiveBinarySearch(array, start, middle - 1, target);
        }

        // recursive call: search middle to end.
        // If element is greater than mid, then the element can only be present in right subarray
        if (target > array[middle]) {
            return recursiveBinarySearch(array, middle + 1, end, target);
        }

        return -1; // We reach here when element is not present in array
    }
}// end of class
