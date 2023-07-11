
public class UStudent extends Student{
	private int year;
	
	void setYear(int year) { this.year = year; }
	int getYear() { return year; }
	
	public UStudent() {
		super();
		setYear(0);
	}
	
	public UStudent(int id, int tuition, double gpa, int year) {
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
		return super.toString() + " 학년=" + getYear();
	}
}