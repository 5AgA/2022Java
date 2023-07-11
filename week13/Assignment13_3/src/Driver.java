
public class Driver {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		Person p1 = new Person("김동덕", 1);
		Person p2 = new Person("홍길동", 20);
		speak3Times(myDog);
		speak3Times(p1);
		speak3Times(p2);
		
	}
	
	private static void speak3Times(Speakable obj) {
		for(int i = 0; i < 3; i++)
			obj.speak();
	}

}
