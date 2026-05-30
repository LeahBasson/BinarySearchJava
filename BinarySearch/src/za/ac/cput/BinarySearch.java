package za.ac.cput;

import static za.ac.cput.BinarySearchClass.iterativeBinarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        // Input array
        int arr[] = {2, 3, 4, 10, 40};

        // Length of array
        int n = arr.length;

        // search element
        int x = 10;

        // Calling the method and storing result
        int result = iterativeBinarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index "
                    + result);
        }
    }// end of main

}// end of class
