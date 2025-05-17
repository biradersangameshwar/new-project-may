package array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] age = {10,20,30,33,40,50};
		
	/*	for(int i=0;i<age.length;i++) {
		
		System.out.println(age[i]);

	}*/
		for(int i : age) {
			System.out.println(i);
		}

	}
}
