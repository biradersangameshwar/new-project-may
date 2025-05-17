package constructr;

public class Param_const4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is beginning");
		bankacc bc = new bankacc("sai",4000);
		bankacc bc1= new bankacc("hari",2345);

	}
}
class bankacc {
	String Accoutname;
	double Balance;
	bankacc(String Name,double bal){
		Accoutname=Name;
		Balance=bal;
		
		System.out.println("Account Holder :"+Accoutname);
		System.out.println("Balance : $"+Balance);
	}	
}