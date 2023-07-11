import java.util.Scanner;
public class Assignment5_3 {

	static void gugudan(int num) {
		System.out.println("구구단 " + num + "단 입니다.");
		for (int i = 1; i < 10; i++)
			System.out.println(num + " * " + i + " = " + (num*i));
	}
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		n = sc.nextInt();
		gugudan(n);
		
	}

}
