
public class Box {
	private int x, y, z;
	private boolean empty;
	
	public Box() {
		this(0, 0, 0);
		emptyBox();
	}
	public Box(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		emptyBox();
	}
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public void setZ(int z) { this.z = z; }
	public int getX() { return x; }
	public int getY() { return y; }
	public int getZ() { return z; }
	
	public void fillBox() {
		empty = false;
	}
	public void emptyBox() {
		empty = true;
	}
	
	public String toString() {
		String state;
		if (empty)
			state = "지금 박스는 비어 있습니다.";
		else
			state = "지금 박스에는 물건이 들어 있습니다.";
		return "가로: " + x +"cm\n" + "세로: " + y +"cm\n" + "높이: " + z +"cm\n" +
					state;
	}
	
}
