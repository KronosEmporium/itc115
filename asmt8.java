//*******************************************************************
//
//  Assignment 8
//
// Includes the functions isUnique and isSorted. isUnique takes an
// array of integers and returns a boolean depending on if all
// the values are unique. isSorted returns a boolean dependent on
// if the array of doubles it takes as a parameter is sorted
// by ascending value.
//
//By: Crosby Allison
//Date: 11/07/2019
//*******************************************************************

public class Assignment8 {

	// isUnique function
	public static Boolean isUnique (int[] arr) {
    
    	// initiliaze iterators
	    int i, k;
	    
	    // Using a for loop, we store the lowest iterated value of the array and check with
	    // a nested for loop if that lowest value is lower than the rest of the values in
	    // the array.
	    for ( i = 0; i < arr.length; i++ ) {
	        int min = arr[i];
	        
	        for ( k = i + 1; k < arr.length; k++ ) {

	        	// if the lowest value is higher than another value in the array, set the
	        	// value of the array which was previously the lowest to this new lowest
	        	// integer and set the lowest integer's old value to the old lowest integer.
	            if (min > arr[k]) {

	                arr[i] = arr[k];
	                arr[k] = min;
	                min = arr[i];
	            }
	        }
	        
	    }
	    
	    // iterate through the sorted array and check for duplicate values
	    for ( i = 0; i < arr.length - 1; i++ ) {
	        if (arr[i] == arr[i + 1]) {
	            return false;
	        }
	    }
	    
	    // return true if there were no duplicates found
	    return true;
	}

	// isSorted function
	public static boolean isSorted (double[]  arr) {
	    
	    // initiliaze iterator
	    int i;
	    
	    // check if array if longer than 1
	    if (arr.length > 1) {

	    	// iterate through array and check if value at next position is greater
	        for ( i = 0; i < arr.length - 1; i++ ) {
	            if (!(arr[i] < arr[i+1])) {
	                return false;
	            }
	        }
	    }
	    
	    // return true if array was in ascending order
	    return true;
	}

	// main method and tests
	public static void main (String[] args) {
		System.out.println(isUnique({2, 4, 6}));
		System.out.println(isSorted({16.1, 12.3, 22.2, 14.4}));
	}
}