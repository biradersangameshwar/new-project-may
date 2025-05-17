package imp_java_programms;

public class Plindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String rev = "";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
			System.out.println(rev);
		}
       if(str.equals(rev)) {
    	   System.out.println("this is palindrome");
       }
       else
    	   System.out.println("this is not a palindrome");
	}

	
	
	
	
}
