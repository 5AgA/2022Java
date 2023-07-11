
public class HourlyEmployee extends Employee{
	private int rate, hours;
	
	void setRate(int rate) { this.rate = rate; }
	void setHours(int hours) { this.hours = hours; }
	int getRate() { return rate; }
	int getHours() { return hours; }
	
	public HourlyEmployee(String name, int id) {
		super(name, id);
	}
	
	int computeSalary() {
		return getRate() * getHours();
	}
	
	public String toString() {
		return super.toString() + "의 지급 급여는 " + computeSalary();
	}
}
