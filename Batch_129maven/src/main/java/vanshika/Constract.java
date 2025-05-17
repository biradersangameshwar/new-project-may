package vanshika;

public class Constract {

	public static void main(String[] args) {
		
		city c1 =new city();
		Employee e1 =new Employee();
		Student  s1=new Student("TATA","Black",2024);
		cite c2 =new cite();
	}
}
class city{
	city(){
		System.out.println("this is pune"); 
	}
}
class Employee{
	int id;
	String name;{
		System.out.println(id+""+name);
	}
}
class Student{
	Student (String model,String color,int year){
		System.out.println(model+""+color+""+year);
	}
}
class cite{
	public void banglore() {
		System.out.println("this is banglore");
	}
}