package pkg1;
public class Bank {

	long balance;
	Bank(long balance){
		this.balance = balance;
	}
	void deposit(long amount){
		balance += amount; 
	}
	void withdraw(long amount) {
		if(amount > balance) {
			System.out.println("Insufficient funds");
		}
		else {
			balance -= amount;
		}
	}

}
