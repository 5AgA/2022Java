package universe;
import planet.A;

public class D extends A{
	void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);	// 같은 패키지가 아니라서 안됨, 
		System.out.println(prv);	// private은 같은 클래스 안에서만 됨
		
		F fobj = new F();	// F가 default이기 때문에 같은 패키지 안에서만 사용 가능
		fobj.acessTest();
	}
}
