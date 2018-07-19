public class Passenger{
	private int pno;
	private String pname;
	private int fare;
	public Passenger(int pno, String pname, int fare) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.fare = fare;
	}
	
	public Passenger()
	{
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fare;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		result = prime * result + pno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		if (fare != other.fare)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (pno != other.pno)
			return false;
		return true;
	}
	
}

