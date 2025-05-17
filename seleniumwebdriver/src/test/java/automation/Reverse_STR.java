package automation;

public class Reverse_STR {

	public static void main(String[] args) {
		
		String str = "Shiv prasad";
		String rev = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse().toString();
		System.out.println(sb);
		
		
		
		
		
		

	}

}
