
public class Rectangle extends Shape implements Movable{
	public void move(int dx, int dy) {
		super.move(dx, dy);
		System.out.println("사각형 이동 좌표\nx: " + super.x + ", y: " + super.y);
	}
	public void draw() {
		System.out.println("사각형 그리기");
	}
}
