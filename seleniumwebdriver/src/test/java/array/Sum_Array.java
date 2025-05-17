package array;

public class Sum_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {10,20,30,40};
		int sum = 0;
        int len = num.length;
        System.out.println(len);
        for (int i=0;i<len;i++) {
        	sum=num[i]+sum;
        	//System.out.println("This is the sum of array:"+sum);
        }
		System.out.println("This is the sum of array:"+sum);
	}

}
