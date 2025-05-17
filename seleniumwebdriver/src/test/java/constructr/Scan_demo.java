package constructr;

import java.util.Date;
import java.util.Scanner;

public class Scan_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is beginning");
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Name :"+ name);
		System.out.println("Age :"+ age);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c =0;
		c = a+b;
		System.out.println("Sum of c :"+c);
		
		Date dt = new Date();
		System.out.println(dt.toString());
		
		int x =10;
		int y =20;
		
		System.out.println("Max value :"+Math.max(x, y));
		System.out.println("Square root of 20 :"+Math.sqrt(y));
		
		sc.close();
		
		
		
		
         }
}
