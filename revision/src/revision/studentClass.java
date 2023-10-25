package revision;
import java.util.Scanner;
class student{
	String name;
	int rollNo;
	double [] marks;
	void setDimension(String name,int rollNo,double [] marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	student(String name,int rollNo,double [] marks){
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	double markTotal(){
		double sum;
		sum=0;		
		int j;
		for(j=0;j<marks.length;j++) {
		sum += marks[j];
		}
		return sum;
	}
	void details() {
		System.out.println(name+" have scored "+markTotal());
	}
}

public class studentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] marks = new double[5];
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter marks ");
		for(int i=0;i<marks.length;i++) {
			 marks[i] = scan.nextDouble();
		}
		student s1 = new student("Aarif",1001,marks);
		student s2 = new student("Riya",1002,marks);
		student s3 = new student("Shiva",1004,marks);
		s1.details();
		
	}

}
