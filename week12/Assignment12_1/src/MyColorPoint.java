
public class MyColorPoint extends MyPoint{
	String color;
	int temp; 
	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	protected void move(int x, int y) {
		this.x = x; this.y = y;
	}
	protected void reverse() {
		temp = x;
		x = y;
		y = temp;
	}
	protected void show() {
		System.out.println(x + "," + y + "," + color);
	}
}
