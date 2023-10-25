package revision;

class Box{
	int length;
	int breadth;
	int height;
	Box(int l,int b,int h){
		length = l;
		breadth = b;
		height = h;
	}
	int surfaceArea(){
		return 2*(length*breadth+breadth*height+height*length);
	}
	
}

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box blackbox = new Box(5,8,9);
		System.out.println(blackbox.surfaceArea());

	}

}
