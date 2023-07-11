
public class Account {
	int balance;
	
	public Account() {
		balance = 0;
		System.out.println("새로운 계좌가 만들어졌습니다.");
	}
	void withdraw(int amount) {
		balance -= amount;
		System.out.println(amount + "원 인출");
		print();
		System.out.println("**********************************");
	}
	void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원 저축");
		print();
		System.out.println("**********************************");
	}
	void print() {
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
	}
}
