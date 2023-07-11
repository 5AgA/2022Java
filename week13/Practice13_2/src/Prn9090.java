
public class Prn9090 implements ColorPrintable{
	public void print(String doc) {
		System.out.println("black & white ver");
		System.out.println(doc);
	}
	public void printCMYK(String doc) {
		System.out.println("color ver");
		System.out.println(doc);
	}
}
