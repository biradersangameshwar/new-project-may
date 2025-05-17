package vanshika;


public class BankAccount {

	public static void main(String[] args) {
	
		BankAccount1 BA1  = new BankAccount1("vanshika",4000);
		BankAccount1 BA2 = new BankAccount1 ("sangam",30000);
		
		BA1. displayAccountDetails();
		BA2. displayAccountDetails();
	}
}
class BankAccount1{
	String AccountName;
	double Balance;
	
	BankAccount1(String name,double bal){
		AccountName =name;
		Balance =bal;
	}
	void displayAccountDetails() {
		System.out.println("Account Holde:" +AccountName);
		System.out.println("Balance :   *$" +Balance);
	}
}