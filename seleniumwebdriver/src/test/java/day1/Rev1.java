package day1;

public class Rev1 {

	public static void main(String[] args) {
		
		String s = "sangam";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			char current = s.charAt(i);
			boolean found = false;
			
			for(int j=0;j<rev.length();j++) {
				if(current == rev.charAt(j)) {
					found = true;
					break;
				}
			}if(!found) {rev = rev + current;
			
		}
			//System.out.println(rev);
	}
		System.out.println(rev);
	}
}
