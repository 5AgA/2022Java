import java.util.Scanner;

public class Assignment2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double mile, kilo;
		
		System.out.print("마일을 입력하시오: ");
		mile = sc.nextDouble();
		kilo = mile * 1.609;
		
		System.out.print((mile) + "마일은 " + (kilo) + "킬로미터입니다.");
	}

}
