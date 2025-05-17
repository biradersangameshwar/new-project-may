package batch_129;

public class Inheritanc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//savingsaccount sa = new savingsaccount();
		//sa.bankdetails();
		//sa.showaccoutType();
		currentaccount ca = new currentaccount();
		
		ca.bankdetails();
		ca.showaccoutType();
		ca.showaccounttype1();

	}

}

class bank{ 
	
	String bankname = "Global bank";
	void bankdetails() {
		System.out.println("Bank : "+bankname);
	}
}
class savingsaccount extends bank{
	double intrestrate = 6.5;
	void showaccoutType() {
		System.out.println("Account type : saving");
		System.out.println("Intrest Rate : "+intrestrate+"%");
	}
}
class currentaccount extends savingsaccount{
	double overdraftlimit = 500000;
	void showaccounttype1() {
		System.out.println("Account type : current");
		System.out.println("overdraft limit : $ "+overdraftlimit);
	}
	
}




