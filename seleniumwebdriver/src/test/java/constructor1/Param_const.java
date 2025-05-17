package constructor1;

public class Param_const {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		banking b1 = new banking(3000,"sangam");
		b1.display();
		banking b2 = new banking(5000,"raju");
		b2.display();
		

	}

}

class banking{
	int balance;
	String accountholder;
	banking(int bal,String hol){
		balance=bal;
		accountholder = hol;
	}
	void display() {
		System.out.println("account holder name:"+accountholder);
		System.out.println("balance:"+balance);
	}
	
	
	
}
