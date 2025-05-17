package practice_08_04_2025;

import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
        int num = sc.nextInt();
 
        // using algorithm
        int rev=0;
       /* while(num!=0)
        {
        	rev=rev*10+num%10;
        	num=num/10;
        }
        System.out.println(rev+" is reverse number ");
        
        //using string buffer
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev1 = sb.reverse();
        System.out.println(rev1+" is reverese number ");
        */
        // by using stringbuilder
        StringBuilder sb1 = new StringBuilder();
        sb1.append(num);
       StringBuilder  rev2 = sb1.reverse();
        System.out.println(rev2+" is reverese number ");
        
        
        
        
	}

}
