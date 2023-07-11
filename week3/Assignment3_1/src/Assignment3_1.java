import java.util.Scanner;
public class Assignment3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3, big = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요:");
		n1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요:");
		n2 = sc.nextInt();
		System.out.println("세번째 숫자를 입력하세요:");
		n3 = sc.nextInt();
		
		if (n1 > n2 && n1 > n3)
			big = n1;
		else if (n2 > n1 && n2 > n3)
			big = n2;
		else
			big = n3;
		
		System.out.print("가장 큰 숫자는 " + big + "입니다.\n");
	}

}
