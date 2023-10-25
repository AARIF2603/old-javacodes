package busRev;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	Bus(int busNo,Boolean ac,int capacity){
		this.busno = busNo;   
		this.ac = ac;
		this.capacity = capacity;
	}
	public int getCapacity(){
		return capacity;
	}
	public void setCapacity(int a){
		capacity=a;
	}
	public int getBusNo(){
		return busno;
	}
	public void setType(boolean val){
		ac = val;
	}
	public boolean getType(){
		return ac;
	}
	public void displayBusInfo(){
		System.out.println("BusNo "+busno+" Ac "+ac+" total capacity "+capacity);
	}
	

}
