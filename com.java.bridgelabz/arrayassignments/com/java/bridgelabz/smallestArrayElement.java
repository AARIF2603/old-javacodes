package com.java.bridgelabz;

public class smallestArrayElement {
	
	    public static void main(String[] args) {
	        int[] numbers = {9, 5, 7, 2, 1, 6}; // Example array

	        int smallest = findSmallest(numbers);
	        System.out.println("The smallest element in the array is: " + smallest);
	    }

	    public static int findSmallest(int[] array) {
	        if (array == null || array.length == 0) {
	            throw new IllegalArgumentException("The array is empty.");
	        }

	        int smallest = array[0]; // Assume the first element is the smallest

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < smallest) {
	                smallest = array[i]; // Update smallest if a smaller element is found
	            }
	        }

	        return smallest;
	    
	}


}
