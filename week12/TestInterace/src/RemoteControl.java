
interface RemoteControl {
	void turnOn();
	void turnOff();
	public default void printBrand() { System.out.println("Remote Control 가능 TV"); }
	
}
