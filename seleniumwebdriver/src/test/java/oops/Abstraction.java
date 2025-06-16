package oops;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       car m = new maruthi();
       
       m.start();
       m.stop();
      // m.diskbreak();
		
	}

}

abstract class car {
	abstract void start();
	
	void stop() {
		System.out.println("car stopped");
		
		
	}
}
 class maruthi extends car{
	
	void start() {
		System.out.println("car start's with button");
	}
	void diskbreak() {
		System.out.println("automatic breaks");
			
		}
	}
