import java.util.Scanner;
public class Practice4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 1, answer;
		double num;
		
		num = Math.random()*100;
		answer = (int)num + 1;
		
		while ((int)num != answer)
		{
			System.out.println("정답을 추측하여 보세요: ");
			answer = sc.nextInt();
			
			if ((int)num == answer)
				System.out.println("축하합니다. 시도횟수 = " + cnt);
			else if ((int)num < answer)
				System.out.println("HIGH");
			else if ((int)num > answer)
				System.out.println("LOW");
			cnt++;
		}

	}

}
