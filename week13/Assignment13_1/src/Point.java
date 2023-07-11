
public class Point {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;  this.y = y;
	}
	public boolean equals(Point a, Point b) {
		if (a.x == b.x && a.y == b.y)
			return true;
		else
			return false;
	}
}
