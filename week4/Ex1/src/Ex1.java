import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month, season = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What month is it? ");
		month = sc.next();
		
		switch (month)
		{
		case "december", "january", "feburary" -> season = "WINTER";
		case "march", "april", "may" -> season = "SPRING";
		case "june", "july", "august" -> season = "SUMMER";
		case "september", "october", "november" -> season = "FALL";
		default -> season = "ERROR";
		}
		if (season == "ERROR")
			System.out.println("ERROR");
		else
			System.out.println("The current season: " + (String)season);
	}

}
