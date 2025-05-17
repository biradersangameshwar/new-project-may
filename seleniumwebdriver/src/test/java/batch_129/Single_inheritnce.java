package batch_129;

public class Single_inheritnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d = new dog();
		d.bark();

	}

}
class animal{
	void eat() {
		System.out.println("tiger is eating");
	}
	
}
class dog extends animal{
	void bark(){
		super.eat();
		System.out.println("dog is barking");
	}
}