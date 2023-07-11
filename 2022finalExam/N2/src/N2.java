import java.util.*;
public class N2 {

	public static void main(String[] args) {
		String str = "Java program";
		int n = str.length();
		char[] st = new char[n];
		String s;
		
		for (int i = 0; i < n; i++)
		{
			s = str[n - 1 - i];
			st[i] = (char)s;
		}
		for (char obj : st)
			System.out.print(obj);

	}

}
