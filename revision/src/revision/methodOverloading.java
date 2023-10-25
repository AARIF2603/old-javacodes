package revision;
public class methodOverloading {
	 static int average(int a, int b) {
		return (a+b)/2;
	}
	 static double average(double a, double b) {
			return (a+b)/2;
		}
	 static int average(int a, int b,int c) {
			return (a+b+c)/3;
		}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(average(5,7));
		System.out.println(average(5.6,7.5));
		System.out.println(average(5,7,8));
	}

}
