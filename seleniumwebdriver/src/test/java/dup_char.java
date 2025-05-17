
public class dup_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "seleniums";
		char ch[] = str.toCharArray();
		//int len = str.length();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					System.out.println(ch[j]);
				}
			}
		}
		
		
	}

}
