
public class palind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "radar";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
			System.out.println(rev);
		}
		if(str.equals(rev))
			System.out.println("this is palindrome");
		else
			System.out.println("this is not a palindrome");
	}

}
