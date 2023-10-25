package com.java.bridgelabz;

public class reverseArray {
	
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        
	        System.out.println("Original array:");
	        printArray(array);
	        
	        System.out.println("Reversed array:");
	        printReverseArray(array);
	    }
	    
	    public static void printArray(int[] array) {
	        for( int element:array ) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }
	    
	    public static void printReverseArray(int[] array) {
	        for (int i = array.length - 1; i >= 0; i--) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    
	}


}
