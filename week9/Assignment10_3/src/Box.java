
public class Box {
	private int length, width, height; // 가로, 세로, 높이
	
	void setLength(int l) { length = l; }
	void setWidth(int w) { width = w; }
	void setHeight(int h) { height = h; }
	int getLength() { return length; }
	int getWidth() { return width; }
	int getHeight() { return height; }
	
	public Box(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	public Box() {
		length = 0;
		width = 0;
		height = 0;
	}
	public double getWeight() {
		return getVolume() * 1.1;
	}
	public int getVolume() {
		return length * width * height;
	}
	public String toString() {
		return "length=" + length + " width=" + width + " height="
				+ height;
	}
}
