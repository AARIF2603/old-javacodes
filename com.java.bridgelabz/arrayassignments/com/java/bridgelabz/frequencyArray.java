package com.java.bridgelabz;
import java.util.Arrays;
public class frequencyArray {
	
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 2, 3, 1, 5, 4, 1};
	        
	        // Sort the array
	        Arrays.sort(array);
	        
	        int n = array.length;
	        int count = 1;
	        
	        // Find the frequency of each element
	        for (int i = 1; i < n; i++) {
	            if (array[i] == array[i - 1]) {
	                count++;
	            } else {
	                System.out.println(array[i - 1] + ": " + count);
	                count = 1;
	            }
	        }
	        
	        // Print the frequency of the last element
	        System.out.println(array[n - 1] + ": " + count);
	    
	}


}
