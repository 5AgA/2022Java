package week14;
import java.util.StringTokenizer;
public class Prac14_1StringTokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Will Jva change my life?");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
