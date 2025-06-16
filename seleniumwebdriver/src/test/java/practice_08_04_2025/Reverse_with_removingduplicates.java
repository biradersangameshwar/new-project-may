package practice_08_04_2025;

public class Reverse_with_removingduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "sangam";
		String rev = "";
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			char c = str.charAt(i);
			
			if(rev.indexOf(c) == -1) {
				rev = rev+c;
			}
			
		}
		System.out.println(rev);

	}

}
