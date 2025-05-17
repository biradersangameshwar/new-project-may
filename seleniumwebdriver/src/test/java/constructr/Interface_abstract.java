package constructr;

public class Interface_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Travelling t1 = new raju();
		Travelling t2 = new ravi();
		t1.byair();
		t1.bytrain();
		t2.byair();
		t2.bytrain();

	}

}

interface Travelling {
	
	public void bytrain();
	public void byair();
	}

class raju implements Travelling{

	 public void bytrain() {
		System.out.println("raju is travelling by train");
		
}

	public void byair() {
		System.out.println("raju can't tavel by air due to health issues");
	}
}

class ravi implements Travelling{

	public void bytrain() {
		System.out.println("ravi cant travel by train");
		
	}

	public void byair() {
		System.out.println("ravi is travelling by air ");
		
	}
	
}