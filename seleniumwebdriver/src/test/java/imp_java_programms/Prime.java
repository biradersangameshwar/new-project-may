package imp_java_programms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int count =0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("this is prime number");
		else
			System.out.println("this is not a prime number");

	}

}
