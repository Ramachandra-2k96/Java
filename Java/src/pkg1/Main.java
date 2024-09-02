package pkg1;

public class Main {
	public static void main(String[] args) {
		Bank bank1 = new Bank(100);
		bank1.deposit(100);
		System.out.println(bank1.balance);
		bank1.withdraw(200);
		System.out.println(bank1.balance);
	}
}
