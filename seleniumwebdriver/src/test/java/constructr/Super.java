package constructr;

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class citi{
	String name;
	
	citi(String name){
		this.name=name;
		}
	void displayinfo() {
		System.out.println("City name :"+name);
	}
}
class mumbai extends citi{

	mumbai(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


		
	
	
}




