
public class Test {
	
	public static void main(String[] args) {
		int temp = add(10,20);
		System.out.println(temp);
	}
	
	public static int add(int x, int y) { return (x+y); }	//static
	public int sub(int x, int y) { return (x-y); }	// non-static
	public void print() {
		System.out.println("*");
		sub(5,8);		// non static
		add(5,8);		//static
	}
}
