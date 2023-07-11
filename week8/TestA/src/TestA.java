
public class TestA {

	public static int addA(int x, int y) {
		Test.add(5, 8);		// static
		Test t = new Test();
		t.sub(5, 8);		// non-static
		return (x+y);
	}
	public int subA(int x, int y) {
		Test t1 = new Test();
		t1.sub(5, 8);		// non-static
		Test.add(5, 8);		// static
		return (x-y);
	}

}
