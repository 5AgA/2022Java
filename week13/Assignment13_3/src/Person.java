
public class Person implements Speakable{
	private String name;
	private int age;
	
	void setName(String name) { this.name = name;}
	String getName() { return name; }
	
	public Person(String n, int a) {
		setName(n); this.age = a;
	}
	
	public void speak() {
		if (this.age > 1)
			System.out.println("안녕");
		else
			System.out.println("응애");
	}
}
