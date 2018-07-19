abstract class Vehicle{
	int price;
	public Vehicle() {
		System.out.println("Vehicle constructor called");
	}
	public abstract void start();
	public abstract void stop();
	public void music() {
		System.out.println("Music");
	}
}

class Car extends Vehicle{
	@Override
	public void start()
	{
		price=90000;
		System.out.println("Car started");
	}
	@Override
	public void stop()
	{
		System.out.println("Car stopped");
	}
}
public class abstractex {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
		System.out.println(v.price);
		v.stop();
		v.music();

	}

}
