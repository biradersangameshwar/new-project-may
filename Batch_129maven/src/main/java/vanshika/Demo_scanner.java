package vanshika;

import java.util.Scanner;

public class Demo_scanner {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		
			System.out.println("enter your name :");
			String name = sc .nextLine();
			
			System.out.println("enter your age :");
			int age = sc .nextInt();
			 
			System.out.println("enter your salary :");
			double salary = sc.nextDouble();
			
			System.out.println("/n ======= user details  ======");
			System.out.println("Name : "+name);
			System.out.println("Age :"+age);
			System.out.println("Salary :"+salary);
			
			sc.close();
		}

	}


