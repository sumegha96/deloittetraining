package assignments;

import java.util.Scanner;

public class WeatherSystem {
		
		//main function
		public static void main(String[] args) {
		String city;
		String ans;
		int n;
		double temperature,t;
				
		//declaring input 
		Scanner scanner = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		Scanner temp = new Scanner(System.in);
		Scanner fc = new Scanner(System.in);
		
		System.out.println("How many cities?");
		n=number.nextInt();
		for(int i=0; i<n; i++)
		{	
			System.out.println("Enter city name:");
			city=scanner.nextLine();
			System.out.println("F for Farenhite, C for Celsius:");
			ans=scanner.nextLine();
			System.out.println("Enter temperature");
			temperature=temp.nextDouble();
			Convert c =new Convert();
			t=c.tempToCelsius(ans, temperature);
			PrintWarning p = new PrintWarning();
			if(p.tempValid(t) == 1)	
				System.out.println("Temperature too high");			
		}
		scanner.close(); number.close(); temp.close(); fc.close(); 
	}
}
