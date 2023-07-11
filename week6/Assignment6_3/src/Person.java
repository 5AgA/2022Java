
public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {
		this.name = "홍길동";
		this.height = 163.0f;
		this.weight = 48.5f;
	}
	public Person(String n, float h, float w) {
		name = n;
		height = h;
		weight = w;
	}
	public void print() {
		System.out.println("이름: " + name + ",  키: " + height +
				",  몸무게: " + weight); 
	}
}