package batch_129;

public class city {

	public static void main(String[] args) {
		Testing1 t1 = new Testing1();
		t1.printmessage();	
		}
		}
		class Student1{
		public void display() {
		System.out.println(" speedwaytech ");
		}
		}
		class Testing1 extends Student1{
		public void display() {
		System.out.println("I am doing software testing ");
		}
		public void printmessage() {
		//This calls overriding methods
		display();
		//this calls overridden methods
		super.display();
		}
		}


