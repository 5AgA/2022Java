import java.util.*;
public class Assignment4_2 {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		double sum = 0.0, max = 0.0;
		
		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		
		for (Double num : list)
		{
			sum += num;
			System.out.print(num + " ");
			if (num > max)
				max = num;
		}
		System.out.println("");
		System.out.println("합은 " + sum);
		System.out.println("최대값은 " + max);
	}

}
