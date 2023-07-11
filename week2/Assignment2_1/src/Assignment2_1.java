import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, box, r;
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		n = sc.nextInt();
		
		box = n / 10;
		r = n % 10;
		
		System.out.print((box) + "박스가 필요하고 " + (r) + "개가 남습니다.");
	}

}
