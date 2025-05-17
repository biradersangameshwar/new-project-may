package array;

public class Arry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,2,3,4,5,6,7};
		
		//System.out.println("Length of array is"+a.length);
		
		int b =a.length;
		
		//System.out.println(a[6]);
		
		for(int i=0;i<b;i++) {
			System.out.print(a[i]);
		}
		
		System.out.println(" ");
		
		for(int e: a) {
			System.out.print(e); 
			
		}

	}

}
