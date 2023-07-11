import java.util.*;

public class Driver {

	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<Shape>();	// 부모 넣어주기
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		for (Shape obj : list)
			obj.draw();
	}

}
