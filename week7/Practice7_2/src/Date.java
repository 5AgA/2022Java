public class Date {
	private int year, month, day;

	public void setYear(int y) { year = y; }

	public void setMonth(int m) { month = m; }

	public void setDay(int d) { day =d; }

	public int getYear() { return year; }

	public int getMonth() { return month; }

	public int getDay() { return day; }

	public void print() {
		System.out.println("현재 나이는 " + (2022 - this.getYear() + 1) + "입니다.");
	}

	public String toString() {
		return "생년월일은 " + year + "년 " + month + "월 " + day + "일 이다";
	}
}
