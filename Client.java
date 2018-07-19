
public class Client {
	public static void main(String[] args) {
		disp();
	}

	public static void disp() {
		Customer customer = new Customer(123, 23523);
		customer.display();
		customer.setCustId(34);
		customer.display();
	}
}
