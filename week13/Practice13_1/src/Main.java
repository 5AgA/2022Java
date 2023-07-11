
public class Main {

	public static void main(String[] args) {
		Printable sp = new SPrinter();
		Printable lp = new LPrinter();
		sp.print("This is a printer driver.");
		lp.print("This is a printer driver.");
	}

}
