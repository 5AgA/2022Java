
public class Employee {
	private String name, position;
	private int id;
	
	void setName(String name) { this.name = name; }
	void setPosition(String position) { this.position = position; }
	void setId(int id) { this.id = id; }
	String getName() { return name; }
	String getPosition() { return position; }
	int getId() { return id; }
	
	public Employee() {
		this("모름", -1);
	}
	public Employee(String name, int id) {
		setName(name);
		setId(id);
	}
	
	public String toString() {
		return getName() + "( " + getPosition() + ", " +
	getId() + " )";
	}
	
	int computeSalary() { return -1; }
}
