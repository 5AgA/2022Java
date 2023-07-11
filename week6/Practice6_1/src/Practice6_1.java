import java.util.Scanner;
public class Practice6_1 {

	public static void main(String[] args) {
		int year, month, day;
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요: ");
		year = sc.nextInt();
		System.out.print("태어난 월을 입력하세요: ");
		month = sc.nextInt();
		System.out.print("태어난 날짜를 입력하세요: ");
		day = sc.nextInt();
		
		Date d = new Date(year, month, day);
		d.print();

	}
}
