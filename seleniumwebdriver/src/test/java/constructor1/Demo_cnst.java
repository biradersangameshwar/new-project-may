package constructor1;

class vehicle{
	public vehicle(){
		System.out.println("This is two wheeler");
	}
	public vehicle(int a) {
		System.out.println("this is three wheeler: "+a);
	
	}
}
class car extends vehicle{
	public car(){
		super(10);
		System.out.println("This is car");
		

		
	}
}





public class Demo_cnst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//vehicle v1 = new vehicle();
		//vehicle v2 = new vehicle(10);
		car c1 = new car();

	}

}
