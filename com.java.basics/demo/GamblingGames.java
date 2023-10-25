package demo;

import java.util.Random;

public class GamblingGames {
	public static void main(String[] args) {
	    // Money = 100
	    // Money !=200 , Money !=0
	    // Money ++ , Money--
	    // random.nextInt(2); // 0 & 1
	    
	    int money = 100;
	    Random random = new Random();
	    int playCount = 0;
	    int wonCount = 0;
	    
	    
	    while(money!=200 && money!=0)
	    {
	        playCount++;
	        
	        
	        System.out.println("Inital Money: "+money);
	        int bet = random.nextInt(2);
	        if(bet==1)
	        {
	            money++;
	         wonCount++;
	        }
	        else
	            money--;
	        
	        System.out.println("Remaining Money: "+money);
	        
	    }
	    
	    System.out.println("Number of times played: "+playCount);
	    System.out.println("Number of times won: "+wonCount);
	    System.out.println("Number of times lost: "+(playCount-wonCount));
	    
	}

	}



