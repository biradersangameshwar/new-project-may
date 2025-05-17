package imp_java_programms;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev += str.charAt(i);
			System.out.println(rev);
			}
		if(str.equals(rev)) {
			System.out.println(rev+" This is palindrome");
		}
		else
			System.out.println(rev+" This is not a palindrome");
		}
		

	}


