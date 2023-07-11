package planet;

public class A {
	public int pub = 1;			// public: 어디서든지 가능
	protected int pro = 2;		// protected: 다른 패키지의 자식 클래스에서 사용 가능
	int def = 3;				// default: 같은 패키지에서 사용 가능
	private int prv = 4;		// private: 같은 클래스에서 만 사용 가능
}
