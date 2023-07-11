import java.util.Scanner;
public class Assignment4_5 {

	public static void main(String[] args) {
		int i = 0, size, sum = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력받는 학생의 수는? : ");
		size = sc.nextInt();
		
		int[] scores = new int[size];
		
		while (i < size)
		{
			System.out.print((i + 1) + "번째 학생의 성적을 입력하세요: ");
			scores[i] = sc.nextInt();
			sum += scores[i];
			i++;
		}
		avg = (double)(sum / size);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
