package constructr;

public class Poly_method_overrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banking b1;
		b1= new Banking();
		

	}

}
class Banking {
	public int balance;
	
	public void account(int balance) {
		this.balance=balance;
		System.out.println("Savings account balance is :"+ balance);
		}

class currentacc extends Banking{
	
	public void account(int balance) {
		System.out.println("Current account balance is :"+balance);
	}
	
}
class fixeddposit extends Banking{
	public void account(int balance ) {
		System.out.println("Fixed account balance is :"+balance);
	
	}
}
}