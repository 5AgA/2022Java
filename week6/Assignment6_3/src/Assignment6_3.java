import java.util.Scanner;
public class Assignment6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		float height;
		float weight;
		
		Person obj1 = new Person();
		System.out.print("이름은? : ");
		name = sc.next();
		System.out.print("키는? : ");
		height = sc.nextFloat();
		System.out.print("몸무게는? : ");
		weight = sc.nextFloat();
		Person obj2 = new Person(name, height, weight);
		
		obj1.print();
		obj2.print();

	}

}
