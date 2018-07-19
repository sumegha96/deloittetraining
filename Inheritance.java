 class Animal{
		public Animal()
		{
			System.out.println("Animal Constructor");
		}
		public void eat()
		{
			System.out.println("Animal eats food");
		}
}

 class Men extends Animal{
	 	public Men()
	 	{
	 		System.out.println("Men Constructor");
	 	}
	 	//@overriding
	 	public void eat()
	 	{
	 		System.out.println("Men eat veg & non veg");
	 		super.eat();
	 	}
 }
 
 class Dog extends Animal{
	 public Dog()
	 {
		 System.out.println("Dog constructor");
	 }
	 public void eat()
	 {
		 System.out.println("Dog eats pedigree");
	 }
	 public void drink()
	 {
		 System.out.println("Dog drinks blood");
		 super.eat();
	 }
 }
public class Inheritance {
	
		public static void main(String[] args) {
				Animal a = new Men();
				a.eat();
				a = new Dog();
				a.eat();
				a = new Animal();
				a.eat();				
	}

}
