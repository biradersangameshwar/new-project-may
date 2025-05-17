package batch_129;

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employer e = new employer();
        e.display();
	}
}
		
class Employee5{
	float salary = 40000;
	
}
class employer extends Employee5{
	int bonus = 10000;
		 void display(){
    System.out.println("employer salary is : "+salary);
    System.out.println("bonus of employer is : "+bonus);
	
}
}
