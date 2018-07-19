class A
{
	private A() {
		}
	public static String dd() {
		return "New Password";
	}
}
class B{
	void display() {
		System.out.println("A display");
	}
}
public class Demo {

	public static void main(String[] args) {
		System.out.println(A.dd());
	}

}
