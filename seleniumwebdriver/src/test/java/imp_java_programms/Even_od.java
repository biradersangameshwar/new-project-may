package imp_java_programms;

import java.util.Scanner;

public class Even_od {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println("This is even number");
		}
		else
			System.out.println("This is odd number");

	}

}
