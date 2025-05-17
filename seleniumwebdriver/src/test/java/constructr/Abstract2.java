package constructr;

public class Abstract2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amoutn = 2000;
		payment p1 = new atmpymt();
		payment p2 = new creditcrdpymt();
		payment p3 = new debitcrdpymt();
		payment p4 = new upi();
		p1.makepayment(20000);
		p1.showpayment();
		p2.makepayment(2900);
		p3.makepayment(3809);
		p4.makepayment(2345);

	}

}
abstract class payment{
	abstract void makepayment(int amount);
	
	public void showpayment() {
		System.out.println("processing payment ,please wait.....");
	}
}
class atmpymt extends payment{

	@Override
	void makepayment(int amount) {
		System.out.println("payment of rs "+amount+"made by using atm");
		}
}
class creditcrdpymt extends payment{

	@Override
	void makepayment(int amount) {
		System.out.println("payment of rs :"+amount+ " made by using creditcard");
		
	}
	
}
class debitcrdpymt extends payment{

	@Override
	void makepayment(int amount) {
		System.out.println("payment of rs "+amount+"made by using debitcard");
		
	}
}
class upi extends payment{

	@Override
	void makepayment(int amount) {
		System.out.println("payment of rs "+amount+"made by using upi");
		
	}
	
}