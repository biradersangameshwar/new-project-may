package batch_129;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jai sri ram";
		int len = str.length();
		System.out.println(len);
		char ch[] = str.toCharArray();
		
		for(int i=len-1;i>=0;i--) {
			System.out.print(ch[i]);
		}

	}

}
