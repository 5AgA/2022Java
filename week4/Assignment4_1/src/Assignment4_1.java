
public class Assignment4_1 {

	public static void main(String[] args) {
		double[] arr = {1.0, 2.0, 3.0, 4.0};
		double sum = 0, max = -1;
		
		System.out.println("toString() 로 출력 : [1.0, 2.0, 3.0, 4.0]");
		for (double num:arr)
		{
			System.out.print(num + " ");
			sum += num;
			if (num > max)
				max = num;
		}
		System.out.println("\n합은 " + sum);
		System.out.println("최대값은 " + max);

	}

}
