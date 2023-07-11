
public class Main {

	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point aa = a;
		Point b = new Point(2, 3);
		Point c = new Point(3, 4);
		if(a.equals(b) == false)
			System.out.println("a와 b는 주소가 다르다");
		else
			System.out.println("a와 b는 주소가 같다(a==b)");
		if(a.equals(aa) == false)
			System.out.println("a와 aa는 주소가 다르다");
		else
			System.out.println("a와 aa는 주소가 같다(a==aa)");
		if(a.equals(a, b) == false)
			System.out.println("a is not equal to b");
		else
			System.out.println("a is equal to b");
		if(a.equals(a, c) == false)
			System.out.println("a is not equal to c");
		else
			System.out.println("a is equal to c");

	}

}
