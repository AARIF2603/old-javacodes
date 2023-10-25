package revision;

public class loopContinue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		outer:
		for(i=1;i<=5;i++) {
			inner:
			for(j=1;j<=5;j++) {
				if(i==2&&j>1) {
					continue;
				}
				if(i==3&&j>3) {
					continue;
				}
				if(i==4&&j>1) {
					continue;
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
