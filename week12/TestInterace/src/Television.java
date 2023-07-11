
public class Television  implements RemoteControl{
	 boolean on;
	 public void turnOn() {
		 on = true;
		 System.out.println("TV가 켜졌습니다.");
	 }
	 public void turnOff() {
		 on = false;
		 System.out.println("TV가 꺼졌습니다.");
	 }
	 @Override
	 public void printBrand() { System.out.println("Power Java TV입니다."); }
}
