package array;

public class Duplicates_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {100,100,300,100,500,100};
		int num=100;
		int count=0;
		for(int value:a) {
			if(value==num) {
				count++;
			}
		}System.out.println(count);
		
		

	}

}
