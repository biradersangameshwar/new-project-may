package day1;

public class Reverse_int {

	public static void main(String[] args) {
		int num = 12345;
		int revnum = 0;
		
		while(num !=0) {
			int remainder = num%10;
			revnum = revnum*10+remainder;
			num = num/10;
		}
		System.out.println(revnum);

	}

}
