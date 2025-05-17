package constructr;

public class Static_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test.display();
		Test t1 = new Test();
		t1.display();
		
	}
}

		class Test {
		    static int value;

		    static {
		        System.out.println("Static block executed");
		        value = 100; // Static variable initialization
		    }

		    static void display() {
		        System.out.println("Value: " + value);
		    }
		}

