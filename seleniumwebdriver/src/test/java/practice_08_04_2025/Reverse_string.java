package practice_08_04_2025;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "selenium";
		String rev = "" ;
		int len = str.length();
		
		/*
		for(int i=len-1;i>=0;i--) {
			rev += str.charAt(i);
			}
		System.out.println(rev);
		
		
		//By using character array
		char a[] = str.toCharArray();
		for(int i=len-1;i>=0;i--) {
			System.out.print   (a[i]);
		}
		*/
		//using String buffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		
		
		
		
		

	}

}
