import java.util.Random;
public class Practice4_4 {

	public static void main(String[] args) {
		String[] shape = {"Clubs", "Spades", "Hearts", "Diamonds"};
		String[] number = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		Random random = new Random();
		
		for (int i = 0; i < 5; i++)
			System.out.println(shape[random.nextInt(3)] + "의 " + number[random.nextInt(12)]);

	}

}
