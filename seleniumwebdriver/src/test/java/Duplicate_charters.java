
public class Duplicate_charters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "testings";
		char ch[] = str.toCharArray();
		System.out.println("Duplicate characterstics");
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					System.out.println(ch[j]);
					break;
				}
			}
		}

	}

}
