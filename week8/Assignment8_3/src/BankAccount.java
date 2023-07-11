
public class BankAccount {
	private String accountNumber, owner;
	private int balance = 0;
	
	public void deposit(int num) {
		balance += num;
	}
	public void withdraw(int num) {
		balance -= num;
	}
	public void transfer(BankAccount a, int money) {
		a.deposit(money);
		this.withdraw(money);
		System.out.println("transfer(" + money + "원)");
	}
	public String toString() {
		return "현재 잔액은 " + balance + "입니다.";
	}
}
