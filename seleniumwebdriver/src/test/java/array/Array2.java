package array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {1,2,3,4,5,6,7};
		System.out.println("Reverse of array");
		int len = num.length;
		System.out.println("Length of array :"+len);
		for(int i=len-1;i>=0;i--) {
			System.out.println(num[i]);
		}

	}

}
