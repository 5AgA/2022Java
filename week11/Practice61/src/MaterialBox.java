
public class MaterialBox extends Box{
	private String attribute;
	
	public void setAttri(String attribute) { this.attribute = attribute; }
	public String getAttri() { return attribute; }
	
	public MaterialBox(int x, int y, int z, String attribute) {
		super(x, y, z);
		setAttri(attribute);
	}
}
