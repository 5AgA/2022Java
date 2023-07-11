
public class Plane {
	private int id, max;
	private String model;
	private static int planes = 0;
	
	public void setId(int id) { this.id = id; }
	public void setModel(String model) { this.model = model; }
	public void setMax(int num) { this.max = num; }
	public int getId() { return id; }
	public String getModel() { return model; }
	public int getMax() { return max; }
	
	public Plane() {
		planes++;
	}
	public Plane(int id, String model, int num) {
		planes++;
		setId(id);
		setModel(model);
		setMax(num);
	}
	public int getPlanes() { return planes; }
	public String toString() { 
		return "식별번호: " + getId() + "편\n모델: " + getModel() + "\n승객수: " +
				getMax() + "명\n현재까지 추가된 비행기는 모두 " + getPlanes() + "대 입니다.\n";
	}
}
