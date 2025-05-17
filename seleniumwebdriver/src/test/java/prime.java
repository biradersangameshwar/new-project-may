
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=29,count=0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0)
				count++;
		}
if (count == 2) {
	System.out.println(num + " this is prime number");
}
	else
		System.out.println(num + " this is not a prime number");
}
	}


