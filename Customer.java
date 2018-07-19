
public class Customer {

	int custId;
	String custName;
	int billAmnt;
	
	public Customer()
	{
		custId=11;
		custName="Hallo";
		billAmnt=897;
	}
	public Customer(int custId, String custName, int billAmnt) {
		this();
		this.custId = custId;
		this.custName = custName;
		this.billAmnt = billAmnt;
	}

	public Customer(int custId, int billAmnt) {
		this();
		this.custId = custId;
		this.billAmnt = billAmnt;
	}

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getBillAmnt() {
		return billAmnt;
	}
	public void setBillAmnt(int billAmnt) {
		this.billAmnt = billAmnt;
	}
	public void display()
	{
		System.out.println("Customer id:" + custId);
		System.out.println("Customer name:" + custName);
		System.out.println("Customer bill:" + billAmnt);
	}
}
