import java.util.Scanner;

public class Assignment2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double F, C;
		
		System.out.print("화씨온도를 입력하시오: ");
		F = sc.nextDouble();
		
		C = (F - 32) / 1.8;
		
		System.out.print("섭씨온도는 " + C);
	}

}
