
public class VStudent extends Student{

	public VStudent() {
		super();
	}
	public VStudent(int id, int tuition, double gpa) {
		super(id, tuition, gpa);
	}
	int calcScholarship() {
		return 0;
	}
}
