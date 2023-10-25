package revision;
class queue{
	int head;
	int temp;
	int q[] = new int[10];
	queue() {
		head=-1;
		temp=head;
	}
	void enque(int item) {
		if(head==9)
			System.out.println("Queue is full");
		else
			q[++head]=item;
	}
	int deque() {
		if(head>=0)
			return q[++temp];
		else
			System.out.println("Queue is empty");
			return -1;
	}
	
}

public class queueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q1 =new queue();
		   System.out.println(q1.deque());
		   q1.enque(1);
		   q1.enque(2);
		   q1.enque(3);
		   System.out.println(q1.deque());
		   System.out.println(q1.deque());

	}

}
