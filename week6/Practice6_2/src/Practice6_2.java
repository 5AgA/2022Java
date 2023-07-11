import java.util.Scanner;
public class Practice6_2 {

	public static void main(String[] args) {
		int w, h;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형의 가로를 입력: ");
		w = sc.nextInt();
		System.out.print("사각형의 세로를 입력: ");
		h = sc.nextInt();
		Rectangle r = new Rectangle(w, h);
		System.out.println("사각형의 넓이는 " + r.area() + "이다.");

	}

}
