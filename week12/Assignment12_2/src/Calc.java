
abstract class Calc {
	protected int a, b;
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public abstract int calculate();
	
}
