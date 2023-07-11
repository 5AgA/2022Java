
public class Food {
	String name;
	int price;
	void setName(String n) { name = n; }
	void setPrice(int p) { price = p; }
	String getName() { return name; }
	int getPrice() { return price; }
	
	public Food() {
		
	}
	public Food(String n, int p) {
		setName(n);
		setPrice(p);
	}
	public String toString() {
		return getName() + ", " + getPrice();
	}
}
