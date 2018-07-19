package assignments;

public class Convert {

	public double tempToCelsius(String f, double temp)
	{
		double t;
		if(f=="F")
		{
			t=5*(temp-32)/19.0;
		}
		else
			t=temp;
		
		return t;
	}
}
