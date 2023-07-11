import java.util.Scanner;
public class Assignment3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		num = sc.nextInt();
		
		if (num % 3 == 0)
			System.out.println("3의 배수임");
		else
			System.out.println("3의 배수가 아님");
	}

}
