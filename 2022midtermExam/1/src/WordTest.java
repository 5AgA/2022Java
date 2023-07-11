import java.util.ArrayList;
import java.util.Scanner;

public class WordTest {
    
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		Word w = new Word();
		//코드 작성
		int num;
		String word;
		
		num = sc.nextInt();
		
		for (int i = 0; i < 2 * num; i++)
		{
			word = sc.next();
			if (word >= 'a' && word <= 'z')
				w.eng = word;
			else
				w.kor = word;
		}
		
		word = sc.next();

		
	}
}
