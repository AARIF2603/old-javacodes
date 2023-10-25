package demo;
//Power using Recursion

public class Power2 {
	 static int calculatePower(int num,int p)
	   {
	       int power=1;
	        for(int i=1 ; i<=p ; i++)
	        {
	            power = power * num;
	        }
	       
	        return power;
	   }

	   public static void main(String[] args) {
	        // Power : 2, 3 => 8 (2X2X2)
	       // 7 , 2 => 49 (7X7)
	       
	    int num=7;
	    int p=2;
	   
	   
	    System.out.println("Power is: "+calculatePower(num,p));
	       
	    // p=2 power=1 num=7 i=1
	    // p=2 power=7 num=7 i=2
	    // p=2 power=49 num=7 i=3
	   

	   }

}
