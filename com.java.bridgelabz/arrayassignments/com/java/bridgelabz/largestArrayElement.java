package com.java.bridgelabz;

public class largestArrayElement {
	
	    public static void main(String[] args) {
	        int[] array = {5, 8, 2, 10, 3};

	        int largest = array[0]; // Assume the first element is the largest

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > largest) {
	                largest = array[i];
	            }
	        }

	        System.out.println("The largest element in the array is: " + largest);
	    
	}


}
