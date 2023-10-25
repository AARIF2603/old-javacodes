package busRev;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
	String passangerName;
	int busNo;
	Date date;
	
	Booking(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passanger: ");
		passangerName=scanner.next();
		System.out.println("Enter bus no: ");
		busNo=scanner.nextInt();
		System.out.println("Enter Date in dd-mm-yyyy: ");
		String dateInput=scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings) {
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusNo() == busNo)
				capacity = bus.getCapacity();
		}
		
		int booked =0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
				
			}
		}
	
		return booked<capacity?true:false;
	}
}
