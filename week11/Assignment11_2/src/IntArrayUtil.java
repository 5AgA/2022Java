import java.util.Scanner;
public class IntArrayUtil {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int key;
		
		System.out.println("10개의 난수를 발생시켜서 배열에 저장합니다.");
		
		for (int i = 0; i < 10; i++)
		{
			arr[i] = (int)(Math.random() * 100 + 1);
			System.out.print(arr[i] + "  ");
		}
		
		System.out.print("\n숫자를 하나 입력하세요: ");
		key = sc.nextInt();
		
		if (searchArray(arr, key) == -1) 
			System.out.println("입력된 숫자 " + key + "는 배열에 존재하지 않습니다.");
		else
			System.out.println("입력된 숫자 " + key + "는 인덱스 " + searchArray(arr, key) + "번에 존재합니다.");
		sc.close();
	}
	
	public static int searchArray(int[] array, int key) {
		for (int i = 0; i < 10; i++)
			if (array[i] == key)
				return i;
		return -1;
	}
}
