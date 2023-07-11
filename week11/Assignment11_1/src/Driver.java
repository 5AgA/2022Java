import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, position;
		int id, monthly, rate, hours;
		
		System.out.print("이름은? ");
		name = sc.next();
		System.out.print("직원번호는? ");
		id = sc.nextInt();
		System.out.print("직급은? ");
		position = sc.next();
		Employee e0 = new Employee(name, id);
		e0.setPosition(position);
		System.out.println(e0 + "\n");
		
		System.out.print("이름은? ");
		name = sc.next();
		System.out.print("직원번호는? ");
		id = sc.nextInt();
		System.out.print("직급은? ");
		position = sc.next();
		System.out.print("월급은? ");
		monthly = sc.nextInt();
		SalariedEmployee e1 = new SalariedEmployee(name, id);
		e1.setPosition(position);
		e1.setMonthly(monthly);
		System.out.println(e1 + "\n");
		
		System.out.print("이름은? ");
		name = sc.next();
		System.out.print("직원번호는? ");
		id = sc.nextInt();
		System.out.print("직급은? ");
		position = sc.next();
		System.out.print("시급은? ");
		rate = sc.nextInt();
		System.out.print("일한 시간은? ");
		hours = sc.nextInt();
		HourlyEmployee e2 = new HourlyEmployee(name, id);
		e2.setPosition(position);
		e2.setRate(rate);
		e2.setHours(hours);
		System.out.println(e2 + "\n");
	}

}
