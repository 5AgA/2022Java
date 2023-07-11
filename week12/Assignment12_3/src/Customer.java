
public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		
	}
	public Customer(int id, String name) {
		setID(id);
		setName(name);
		this.initCustomer();
	}
	void setID(int id) { this.customerID = id; }
	void setName(String name) { this.customerName = name; }
	void setGrade(String grade) { this.customerGrade = grade; }
	int getID() { return customerID; }
	String getName() { return customerName; }
	String getGrade() { return customerGrade; }
	
	public void initCustomer() { 
		setGrade("SILVER");
		this.bonusRatio = 0.01;
	}
	int calcPrice(int price) {
		bonusPoint = (int)(price * bonusRatio);
		return price;
	}
	String showCustomerInfo() {
		return getName() + " 님의 등급은 " + getGrade() + "이며, 보너스 포인트는 "
				+ bonusPoint + "입니다.";
	}
	
}
