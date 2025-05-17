package constructor1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vehicle1 v = new vehicle1();
		car2 c = new car2();
		auto a = new auto();

	}

}
class vehicle1{
	vehicle1(){
		System.out.println("this is google");
	 }
	 public void honda(String s) {
		 System.out.println("this is honda"+s);
	 }
}
class car2 extends vehicle1{
	car2(){
		    super.honda("hero");
		    //super();
			System.out.println("this is hero");
			
			
		}
	}
class auto{
	int a;
	String s;{
		System.out.println("this is auto:"+a+s);
	}
}

