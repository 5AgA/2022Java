import java.util.Calendar;
public class Cal {

	public static void main(String[] args) {
		int h, m;
		h = Calendar.HOUR;
		m = Calendar.MINUTE;
		System.out.println("지금은 " + h + "시 " + m + "분입니다.");
		if (h >= 6 && h < 12)
			System.out.println("Good Morning");
		else if (h < 18)
			System.out.println("Good Afternoon");
		else if (h < 22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
		
	}
	
}
