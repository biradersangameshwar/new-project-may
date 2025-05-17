package constructr;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is beginning");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		
			if(num%2 == 0) {
			System.out.println(num + "is an Even number");
				}
			else {
				System.out.println(num + "is an odd number");
			
		}
		sc.close(); 
		

	}

}
