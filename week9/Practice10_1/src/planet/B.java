package planet;

public class B extends A{
	public void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(prv);	// 같은 클래스 내에서만 사용 가능
		
		F fobj = new F();
		fobj.accessTest();
	}
}
