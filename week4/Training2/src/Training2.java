
public class Training2 {

	public static void main(String[] args) {
		int i;
		
		for (i = 0; i < 5; i++)
		{
			if ((i*3+1) < 10)
				System.out.print(" " + (i * 3 + 1) + " ");
			else
				System.out.print((i * 3 + 1) + " ");
			if (i % 5 == 4)
				System.out.println(" ");
		}
		
		while (i < 34)
		{
			System.out.print((i * 3 + 1) + " ");
			if (i % 5 == 4)
				System.out.println(" ");
			i++;
		}

	}

}
