
public class reve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String str = "sangameshwar";
		String reversed = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			reversed += str.charAt(i);
		}
		System.out.println(reversed);
		*/
	/*String str = "sangameshwar";
	int len = str.length();
	System.out.println(len);
	for(int i=len-1;i>=0;i--) {
		char ch[] = str.toCharArray();
		System.out.print(ch[i]);
	}
	*/
		String str = "sangameshwar";
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
		
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1.reverse().toString());
		
		
		
		
	}
}
		
		