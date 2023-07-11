
public class SPrinter implements Printable{
	public void print(String doc) {
		System.out.println("From Samsung printer\n" + doc);
		System.out.println("페이지 폭: " + PAPER_WIDTH);
	}
}
