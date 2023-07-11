
public class Shape implements Movable{
	int x, y;
	
	void setX(int dx) { x = dx; }
	void setY(int dy) { y = dy; }
	int getX() { return x; }
	int getY() { return y; }
	
	public void draw() {
		System.out.println("그리기");
	}
	public void move(int dx, int dy) {
		setX(dx);
		setY(dy);
	}
	
}
