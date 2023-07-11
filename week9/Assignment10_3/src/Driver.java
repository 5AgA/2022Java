
public class Driver {

	public static void main(String[] args) {
		MaterialBox box1 = new MaterialBox(2, 3, 4, "wood");
		System.out.println(box1);
		System.out.println("재질은 " + box1.getAttri());
		System.out.println("부피는 " + box1.getVolume());
		System.out.println("무게는 " + box1.getWeight());
	}

}
