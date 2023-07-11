
public class Bread extends Food{
	int num;
	
	void setNum(int n) { num = n; }
	int getNum() { return num; }
	
	public Bread(String N, int p, int n) {
		setNum(n);
		setPrice(p);
		setName(N);
	}
	
	
}
