import java.util.Scanner;
public class Training {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		n1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		n2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요: ");
		n3 = sc.nextInt();
		
		if (n1 <= n2 && n1 <= n3)
			System.out.println("가장 작은 숫자는 " + n1 + "입니다.");
		else if (n2 <= n1 && n2 <= n3)
			System.out.println("가장 작은 숫자는 " + n2 + "입니다.");
		else
			System.out.println("가장 작은 숫자는 " + n3 + "입니다.");
	}

}
