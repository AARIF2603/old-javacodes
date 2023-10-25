package revision;

public class loopContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<100;i++) {
			if( (i%4==0) || (i%6==0) ) {
				continue;	
			}
			System.out.println(i);
		}
			

	}

}
