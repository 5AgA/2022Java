
public class IntArrayUtil {
	void genRandom(int[] array) {
		int num, i = 0;
		
		while (i < array.length)
		{
			num = (int)(Math.random() * 101);
			if (searchArray(array, num) == -1)
				array[i++] = num;
			else
				continue;
		}
			
	}
	void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
	
	int searchArray(int[] array, int key) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == key)
				return i;
		return -1;
	}
}
