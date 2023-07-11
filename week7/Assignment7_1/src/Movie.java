
public class Movie {
	private String title, director, production;
	
	public Movie() {
		System.out.println("영화정보를 입력하세요.");
	}
	
	void setTitle(String t) { title = t;}
	String getTitle() { return title;}
	void setDirector(String d) { director = d;}
	String getDirector() { return director;}
	void setProduction(String p) { production = p;}
	String getProduction() { return production;}
	
	public String toString() {
		return "제목: " + this.getTitle() + "\n감독: " + this.getDirector()
		+ "\n제작사: " + this.getProduction();
	}
}
