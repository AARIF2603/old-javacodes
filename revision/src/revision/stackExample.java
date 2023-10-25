package revision;

class stack{
	int tos;
	char s[] = new char[10];
	stack() {
		tos=-1;
	}
	void push(char item){
		if(tos==9) 
			System.out.println("Stack is full");
		else
			s[++tos]=item;	
	}
	char pop() {
		if(tos>=0)
			return s[tos--];
		else
			System.out.println("Stack is Empty");
			return 'n';
	}
	
}

public class stackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack s1 =new stack();
		   s1.push('a');
		   s1.push('b');
		   s1.push('d');
		   System.out.println(s1.pop());
		   System.out.println(s1.pop());
		   

	}

}
