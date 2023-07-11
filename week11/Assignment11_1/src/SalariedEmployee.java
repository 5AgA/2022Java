
public class SalariedEmployee extends Employee{
	private int monthly;
	
	void setMonthly(int monthly) { this.monthly = monthly; }
	int getMonthly() { return monthly; }
	
	public SalariedEmployee(String name, int id) {
		super(name, id);
	}
	
	int computeSalary() {
		return getMonthly() * 12;
	}
	
	public String toString() {
		return super.toString() + "의 지급 급여는 " + computeSalary();
	}
}
