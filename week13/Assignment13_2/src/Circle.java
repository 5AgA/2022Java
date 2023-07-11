
public class Circle extends Shape implements Movable{
	public void move(int dx, int dy) {
		super.move(dx, dy);
		System.out.println("원 이동 좌표\nx: " + super.x + ", y: " + super.y);
	}
	public void draw() {
		System.out.println("원 그리기");
	}
}
