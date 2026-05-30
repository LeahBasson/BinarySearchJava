package za.ac.cput;

public class BinarySearchClass {

    static int iterativeBinarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1; // high = last element in the array.
        
        // Checking element in whole array
        while (low <= high) {
            int m = low + (high - low) / 2; // these are the indexes.

            // Check if x is present at mid
            if (arr[m] == x) {
                return m;
            }
            
            // If x greater, ignore left half
            if (arr[m] < x) {
                low = m + 1; // you set the new low which is the 1st number of the right half.
            } 
            
            // If x is smaller,element is on left side,
            // so ignore right half
            else {
                high = m - 1; // 
            }
        }

        // If we reach here, element is not present
        return -1;
    }
    
}// end of class
