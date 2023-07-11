package planet;

public class C {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);
		System.out.println(aobj.def);
		System.out.println(aobj.prv);	// 같은 클래스 내에서만 사용 가능, getter로 불러오기
		
		F fobj = new F();
		fobj.accessTest();
		}
}
