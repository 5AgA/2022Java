
public class Practice4_2 {

	public static void main(String[] args) {
		int sum = 0, i;
		
		for (i = 1; i < 101; i++)
		{
			if (i % 3 == 0 || i % 4 == 0)
				sum += i;
		}
		
		System.out.println("3 또는 4의 배수의 합="+ sum);
	}

}
