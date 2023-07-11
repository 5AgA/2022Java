import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int x, y;
		String op;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오.(ex. 80 4 /)");
		x = sc.nextInt();
		y = sc.nextInt();
		op = sc.next();
		
		switch (op)
		{
		case "+" :
			Calc a = new Add();
			a.setValue(x, y);
			System.out.println(a.calculate());
			break;
		case "-" :
			Calc s = new Sub();
			s.setValue(x, y);
			System.out.println(s.calculate());
			break;
		case "*" :
			Calc m = new Mul();
			m.setValue(x, y);
			System.out.println(m.calculate());
			break;
		case "/" :
			Calc d = new Div();
			d.setValue(x, y);
			System.out.println(d.calculate());
			break;
		default :
			System.out.println("잘못된 연산자 입니다.");
		}
		
		sc.close();
	}

}
