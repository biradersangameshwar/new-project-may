package constructr;

public class Encapsul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is beginning");
		Emplyee e1 = new Emplyee();
		e1.setName("sangam");
		e1.setAge(29);
		
		
		System.out.println("Name :"+e1.getName());
		System.out.println("Age :"+e1.getAge());

	}

}

class Emplyee{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
		this.age = age;
	}
		else {
			System.out.println("Invalid age");
		}
}
}



