import java.util.Scanner;
public class Practice7_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		
		System.out.print("태어난 년도를 입력하세요: ");
		date.setYear(sc.nextInt());
		System.out.print("태어난 월을 입력하세요: ");
		date.setMonth(sc.nextInt());
		System.out.print("태어난 날짜를 입력하세요: ");
		date.setDay(sc.nextInt());
		System.out.println("당신의 생일은 " + date.getYear() + "년 "
				+ date.getMonth() + "월 " + date.getDay() + "일입니다.");
		date.print();
	}

}
