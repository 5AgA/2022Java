import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Professor a = new Professor();
		System.out.print("Professor : ");
		a.setPhone(sc.nextLine());
		Person b = a;
		System.out.println("Professor : " + b.getPhone());
		sc.close();
	}

}
