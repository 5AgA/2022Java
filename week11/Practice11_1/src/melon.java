
public class Melon extends Food{
	String info;
	
	void setInfo(String info) { this.info = info; }
	String getInfo() { return info;}
	
	public Melon(int cal, int cost, int kg, String info) {
		super(cal, cost, kg);
		setInfo(info);
	}
	
	public String toString() {
		return "Melon의 정보\n칼로리 : " + getCal() + "\n가격 : "
				+ getCost() + "\n중량 : " + getKg() + "\n정보 : "
				+ getInfo() + "\n";
	}
}
