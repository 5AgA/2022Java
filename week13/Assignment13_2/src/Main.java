public class Main {

	public static void main(String[] args) {
		System.out.println("Movable 타입 객체 배열- Shape클래스에서 인터페이스 구현");
		
		Movable [] obj = new Shape[3];
		obj[0] = new Rectangle();
		obj[1] = new Triangle();
		obj[2] = new Circle();
		
		for(int i = 0; i < 3; i++)
		{
			Shape s = (Shape)obj[i];
			s.draw();
			obj[i].move((int)(Math.random() * 101), (int)(Math.random() * 101));
			System.out.println(" ");
		}
		
	}

}