import java.util.Scanner;

public class Assignment2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double get, price, tax, rem;
		
		System.out.print("받은 돈: ");
		get = sc.nextInt();
		System.out.print("상품 가격: ");
		price = sc.nextInt();
		
		tax = price * 0.1;
		rem = get - price;
		
		System.out.print("부가세: " + (int)tax + "\n");
		System.out.print("잔돈: " + (int)rem);
	}

}
