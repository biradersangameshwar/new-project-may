package batch_129;

public class Access_modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("this is Beginning");
		
		BankAccount ba = new BankAccount();
		ba.deposit(7000);
		ba.withdraw(5000);
		System.out.println("this is remaning balance : "+ ba.getBalance());

	}
}
class BankAccount{
	private double balance;//this is private -->accessable only with in this class
	
	public void deposit(double amount) { // accessable globally
		if (amount>0) {
			balance += amount;
			System.out.println("deposite : "+amount);
			
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<= balance) {
			balance -= amount;
			System.out.println("withdraw : "+amount);
			}
		else {
			System.out.println("Insufficient fund");
		}
	}
	public double getBalance() {
		return balance;
		
	}
}
