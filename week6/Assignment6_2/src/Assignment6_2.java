import java.util.Scanner;
public class Assignment6_2 {

	public static void main(String[] args) {
		Account acc = new Account();
		Scanner sc = new Scanner(System.in);
		int amount, choice;
		
		acc.print();
		do
		{
			System.out.println("1. 입금 2. 인출 3. 조회 4. 종료");
			System.out.print("원하는 업무를 선택하세요: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.print("입금액은? ");
				amount = sc.nextInt();
				acc.deposit(amount);
				break;
			case 2:
				System.out.print("출금액은? ");
				amount = sc.nextInt();
				acc.withdraw(amount);
				break;
			case 3:
				acc.print();
				System.out.println("**********************************");
				break;
			case 4:
				System.out.println("**********************************");
				System.out.println("예금 업무 종료!");
				break;
			default :
				System.out.println("입력이 잘못됐습니다.");
				System.out.println("**********************************");
				break;
			} 
			
		} while (choice != 4);
		
	}

}
