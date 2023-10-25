package demo; 

//Power

public class Power {
	 public static void main(String[] args) {
	        // Power : 2, 3 => 8 (2X2X2)
	       // 7 , 2 => 49 (7X7)
	       
	    int num=7;
	    int p=2;
	    int power=1;
	    for(int i=1 ; i<=p ; i++)
	    {
	        power = power * num;
	    }
	   
	    System.out.println("Power is: "+power);
	       
	    // p=2 power=1 num=7 i=1
	    // p=2 power=7 num=7 i=2
	    // p=2 power=49 num=7 i=3
	   

	   }

	}


