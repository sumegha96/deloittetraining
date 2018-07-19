
public class PassengerMain {
	public static void main(String[] args) {
		Passenger passenger1 = new Passenger(1996, "Sumo", 500);
		Passenger passenger2 = new Passenger(1996, "Sumo", 500);
		Passenger passenger = passenger1;
		
		System.out.println(passenger1.equals(passenger2));
	}

}
