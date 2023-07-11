package universe;
import planet.A;

public class E {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);	// 다른 패키지이지만, 자식이 아니여서 안됨
		System.out.println(aobj.def);	// 같은 패키지가 아니라서 안됨
		System.out.println(aobj.prv);	// 같은 클래스가 아니라서 안됨
		
		F fobj = new F();	// F가 default라서, 다른 패키지에선 사용 안됨
		fobj.acessTest();
	}
}
