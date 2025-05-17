package constructr;

import java.util.Scanner;

public class Scan1_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("======userdetails=======");
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary :"+salary);
		
		sc.close();
		try {
		System.out.println("Enter your name :");
		String na= sc.nextLine();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("this block will execute always");
		}
		
		
		

	}

}
