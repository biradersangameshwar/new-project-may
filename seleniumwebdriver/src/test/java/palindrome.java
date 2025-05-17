
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "madam";
		StringBuilder sb = new StringBuilder(str);
		String reversed = sb.reverse().toString();
		if (str.equals(reversed)) {
			System.out.println(reversed+ " is a palindrome");
		}
			else {
				System.out.println(reversed + "is not a palindrome");
			
			}
		}
		//System.out.println(reversed + "is not a palindrome");
	}


