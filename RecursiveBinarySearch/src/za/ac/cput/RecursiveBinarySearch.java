
package za.ac.cput;

import static za.ac.cput.RecursiveBinarySearchClass.recursiveBinarySearch;


public class RecursiveBinarySearch {

    
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;

        int result = recursiveBinarySearch(
                array,
                0,                    // start index
                array.length - 1,     // end index
                target
        );

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }// end of main
    
}// end of class
