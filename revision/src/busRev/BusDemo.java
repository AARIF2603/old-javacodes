package busRev;
import java.util.*;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Booking> bookings = new ArrayList<Booking>(); 
		ArrayList<Bus> buses = new ArrayList<Bus>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,49));
		buses.add(new Bus(3,true,48));
		Scanner scanner = new Scanner(System.in);
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		int useropt =1;
		while(useropt==1) {
			System.out.println("Enter 1 to book 2 to exit");
			useropt=scanner.nextInt();
			if(useropt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(buses,bookings)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Sorry. Bus is full.Try another bus or date.");
			
			}
		
		}

	}
}