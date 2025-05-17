package batch_129;

public class Demo_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child ch = new child();
		ch.display();
		
		

	}

}

class parent{
	public void display() {
		System.out.println("this is parent class method");
	}
}
class child extends parent{
	public void display() {
		super.display();{
		System.out.println("this is child method");
	}
	}
	
}
 class parent1{
	   parent1(){
		   System.out.println("this parent1 class constructor");
	   }
 }
class child1 extends parent1{
	child1(){
		super();
		System.out.println("this is child1 class constructor");				
	}
}

