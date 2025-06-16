package oops;

public class Intface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d = new dog();
		d.sound();
		d.eat();
		d.behaviour();
		d.food();
		d.display();

	}

}

interface Animal{
	public void sound();
	abstract void eat();
}

interface Birds extends Animal{
	void behaviour();
	void food();
	
}

class dog implements Birds{

	public void sound() {
		System.out.println("this is dog");
		
	}

	public void eat() {
		System.out.println("dog is eating");
		
	}

	public void behaviour() {
		System.out.println("good in behaviour");
		
	}

	public void food() {
		System.out.println("light food they eat");
	}	
	 void display() {
		System.out.println("this is beginning");
	}
		
	}
	
	
	



