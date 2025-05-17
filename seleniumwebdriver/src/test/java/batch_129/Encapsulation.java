package batch_129;

public class Encapsulation {

	public static void main(String[] args) {
		// Encapsulation is the concept of binding the data and methods and restrict access to the data
		// it improve the data security,maintain code flexiblity , code reuse
		// by using private fileds and provide public getter and setter methods
		System.out.println("this is beginning");
		employee e1 = new employee();
		e1.setname("sujeet");
		e1.setage(32);
		System.out.println("name : "+e1.getname());
		System.out.println("age : "+e1.getage());
		
		
		}
}
class employee{
	private String name;
	private int age;
	
	// getter method for name
	public String getname() {
		return name;
	}
	// setter method for name
	public void setname(String name) {
		this.name=name;
		}
	// getter method for age
	public int getage() {
		return age;
		}
	//setter method for age
	public void setage(int age) {
		if(age>0) {
			this.age=age;
			}
		else {
			System.out.println("invalid age");
		}
	}
}