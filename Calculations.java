package assignments;

import java.util.Scanner;

public class Calculations {

	public static void main(String[] args) {
		int num1, num2;
		double numa, numb;
		Calculator c = new Calculator();
		c.add(1,2);
		c.add(3,	 5.5);
		c.add(4.5, 6.5);
		c.add(45.32, 2);
		c.diff(1,2);
		c.diff(3,	 5.5);
		c.diff(4.5, 6.5);
		c.diff(45.32, 2);
		c.mul(1,2);
		c.mul(3,	 5.5);
		c.mul(4.5, 6.5);
		c.mul(45.32, 2);
		c.div(1,2);
		c.div(3,	 5.5);
		c.div(4.5, 6.5);
		c.div(45.32, 2);
	}

}
