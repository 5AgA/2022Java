
public class BankAccount {
	private String name, accNo;
	private int balance;
	private double interest;
	
	void setName(String name) { this.name = name; }
	void setAccNo() { this.accNo = (int)(Math.random() * 9000 + 1000) + "-" + (int)(Math.random() * 9000 + 1000); }
	void setBalance(int balance) { this.balance += balance; }
	void setInterest(double interest) { this.interest = interest; }
	String getName() { return name; }
	String getAccNo() { return accNo; }
	int getBalance() { return balance; }
	double getInterest() { return interest; }
	
	public BankAccount() {
		balance = 0;
		interest = 0.0;
	}
	public BankAccount(String name, int balance) {
		setName(name);
		setBalance(balance);
		setAccNo();
	}
	public BankAccount(String name, int balance, double interest) {
		setName(name);
		setBalance(balance);
		setInterest(interest);
		setAccNo();
	}
	
	public boolean deposit(int money) {
		if (money < 0)
			return false;
		else
		{
			setBalance(money);
			return true;
		}
	}
	public boolean withdraw(int money) {
		if (money > balance)
			return false;
		else
		{
			setBalance(-money);
			return true;
		}
	}
	public static boolean transfer(BankAccount from, BankAccount to, int money) {
		if (from.balance >= money && money >= 0)
		{
			from.withdraw(money);
			to.deposit(money);
			return true;
		}
		else
			return false;
	}
	
	public String toString() {
		return getAccNo() + " : : " + getName() + " : : " + getBalance() + "원 : : " + getInterest() + "%";
	}
}
