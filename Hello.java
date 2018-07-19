import finance.Salary;

public class Hello {

	public void display()
	{
		System.out.println("Display called");
		How how = new How();
		how.hi();
	}
	public void accept()
	{
		System.out.println("Accept called");
		Hello hello= new Hello();
		hello.display();
	}
	public static void main(String[] args) {
		
		/*
		 int i=0;
		int j=2;
		boolean b=(i>j) && (j++>i);
		System.out.println(j);
		b=(i>j)&(j++>i);
		System.out.println(j);
		*/
		System.out.println("Hello and Welcome to IDE");
		Hello h = new Hello();
		h.display();
		h.accept();
		Employee employee = new Employee();
		employee.getDetails();
		System.out.println("Main ended"); 
	}
}

class How
{
	public void hi()
	{
		System.out.println("Hi belongs to How Class");
	}
	public static void main(String[] args) {
		System.out.println("Hi, I'm How main");	
	}
}
