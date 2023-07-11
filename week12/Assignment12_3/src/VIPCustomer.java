
public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int id, String name, int ai) {
		super(id, name);
		super.setGrade("VIP");
		this.agentID = ai;
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	int calcPrice(int price) {
		bonusPoint = (int)(price * bonusRatio);
		return (int)(price * (1 - saleRatio));
	}
	String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}
}
