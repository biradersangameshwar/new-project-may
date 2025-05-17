package array;

import java.util.Arrays;

public class Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {102,103,203,900,330,405,590};
		int max = 0;
		
		int len = num.length;
		
		for(int i =0;i<len;i++) {
			if(num[i]>max) {
				max=num[i];
				//System.out.println(max);
			}
			//System.out.println(max);
		}
		System.out.println(max);
		Arrays.sort(num);
		System.out.println(num);
		
	}

}
