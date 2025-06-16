package practice_08_04_2025;

public class Rev_printonlyduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "hello world";
		String duplicate = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			char c =str.charAt(i);
			if(str.indexOf(c) != str.lastIndexOf(c)) {
				if(duplicate.indexOf(c)== -1) {
					duplicate = duplicate+c;
				}
			}
		}
           System.out.println(duplicate);
           */
		
		String str = "hello world";
		String dup = "";
		int len = str.length();
		for(int i=len-1;i>=0;i--) {
			char c = str.charAt(i);
			if(str.indexOf(c) != str.lastIndexOf(c)) {
				if(dup.indexOf(c) == -1) {
					dup = dup+c;
				}
			}
			
		}System.out.println(dup);
		
		}

}
