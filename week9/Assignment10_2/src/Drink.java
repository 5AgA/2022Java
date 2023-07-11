
public class Drink extends Food{
	String size;
	
	void setSize(String s) { size = s; }
	String getSize() { return size; }
	
	public Drink(String n, int p, String s) {
		setName(n);
		setPrice(p);
		setSize(s);
	}
	
}
