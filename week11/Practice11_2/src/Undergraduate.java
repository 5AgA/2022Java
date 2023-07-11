
public class Undergraduate extends Student{
	private int year;
	
	void setYear(int year) { this.year = year; }
	int getYear() { return year; }
	
	public Undergraduate() {
		super();
		setYear(0);
	}
	
	public Undergraduate(int id, int tuition, double gpa, int year) {
		setId(id);
		setTuition(tuition);
		setGpa(gpa);
		setYear(year);
	}
	
	int calcScholarship() {
		if (getGpa() >= 3.0)
			return (int)((double)getTuition() * 0.3);
		else
			return 0;
	}
	
	public String toString() {
		return "id=" + getId() + " tuition=" + getTuition() + " gpa" + getGpa() + 
				" 장학금=" + calcScholarship() + " 학년=" + getYear();
	}
}
