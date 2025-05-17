package array;

public class Lenth_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is beginning");
		
		int[] num = {100,200,300,400,440,500,600};
		
		int max=0;
		
		int len = num.length;
		System.out.println("this is length of Array = "+len);
		
		for(int i=0;i<len;i++) {
			if(num[i]>max) {
				
				max=num[i];
				//System.out.println("This is the biggest element = :"+max);
			}
			//System.out.println("This is the biggest element = :"+max);
		}
		System.out.println("This is the biggest element = :"+max);
		
		

	}

}
