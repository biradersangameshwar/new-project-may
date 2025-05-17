package array;

public class Even_odd_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int a[] = {1,2,3,4,5,6};
		
		for(int x: a) {
			if(x%2==0) {
				System.out.println(x+" this is even number");
			}else
			System.out.println(x+" this is odd number");
		}

		for(int i=1;i<=a.length;i++) {
			if(i%2==0) {
				System.out.println(i+" this is even number");
			}else
			System.out.println(i+" this is odd number");
		}
		}
		
		
		
	}


