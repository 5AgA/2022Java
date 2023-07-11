
public class Person {
	private int weight, height;
	
	public void setWeight(int w) { this.weight = w; }
	public void setHeight(int h) { this.height = h; }
	public int getWeight() { return weight; }
	public int getHeight() { return height; }
	
	public boolean isTallerThan(int w2) {
		if (this.height > w2)
			return true;
		else if (this.height < w2)
			return false;
		return false;
	}
	
	public int idealWeight() { return height-110; }
	public boolean needDiet() {
		if (this.idealWeight() >= this.weight)
			return false;
		else
			return true;
	}
}
