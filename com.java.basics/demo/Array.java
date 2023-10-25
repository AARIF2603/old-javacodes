package demo;

public class Array {

	public static void main(String[] args) {
		
		       
		       int num [] = {1,2,3,4,5}; // 0 ,1,2,3,4
		        // {5,4,3,2,1}
		        // {5,2,3,4,1} // 5/2 ==> 2
		       
		        // {5,2,3,4,1}
		        // {5,4,3,2,1}
		        // {5,4,3,2,1}
		        // {5,2,3,4,1}
		        // {1,2,3,4,5}
		       
		       for(int i=0;i<num.length/2;i++)
		       {
		           int temp = num[i];
		           num[i] = num[num.length-i-1]; // num[4]
		           num[num.length-i-1] = temp;
		       }

		       for (int i = 0; i < num.length; i++) {
		           System.out.println(num[i]);
		       }
		       
		   }


	

}
