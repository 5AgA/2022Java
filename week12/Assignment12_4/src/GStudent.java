
public class GStudent extends Student{
	private String lab;
	
	void setLab(String lab) { this.lab = lab; }
	String getLab() { return lab; }
	
	public GStudent() {
		super();
		setLab(" ");
	}
	
	public GStudent(int id, int tuition, double gpa, String lab) {
		setId(id);
		setTuition(tuition);
		setGpa(gpa);
		setLab(lab);
	}
	
	int calcScholarship() {
		if (getGpa() >= 3.5)
			return (int)((double)getTuition() * 0.5);
		else
			return (int)((double)getTuition() * 0.1);
	}
	
	public String toString() {
		return super.toString() + " 연구실=" + getLab();
	}
}