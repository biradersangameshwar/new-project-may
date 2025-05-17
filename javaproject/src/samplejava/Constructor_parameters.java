package samplejava;

public class Constructor_parameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		two t1 = new two();

	}

}

class two {
	
	String name = "hari";
	int id = 2;
	{
		System.out.println(name+" "+id);
	}
}