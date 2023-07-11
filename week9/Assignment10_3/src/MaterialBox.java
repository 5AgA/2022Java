
public class MaterialBox extends Box{
	private String attribute;
	
	public MaterialBox(int l, int w, int h, String a) {
		setLength(l);
		setWidth(w);
		setHeight(h);
		setAttri(a);
	}
	public void setAttri(String a) { attribute = a; }
	public String getAttri() { return attribute; }
	
}
