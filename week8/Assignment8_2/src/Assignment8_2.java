import java.util.Scanner;
public class Assignment8_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Plane p1 = new Plane();
		int i, n;
		String m;
		
		System.out.println("제주행 비행기의 정보를 입력하세요.");
		System.out.print("식별번호: ");
		p1.setId(sc.nextInt());
		System.out.print("모델: ");
		p1.setModel(sc.next());
		System.out.print("승객수: ");
		p1.setMax(sc.nextInt());
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.println(p1);
		
		System.out.println("서울행 비행기의 정보를 입력하세요.");
		System.out.print("식별번호: ");
		i = sc.nextInt();
		System.out.print("모델: ");
		m = sc.next();
		System.out.print("승객수: ");
		n = sc.nextInt();
		Plane p2 = new Plane(i, m, n);
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.println(p2);
		
		sc.close();
	}

}
