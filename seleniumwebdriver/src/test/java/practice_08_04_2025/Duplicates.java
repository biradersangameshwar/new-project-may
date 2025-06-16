package practice_08_04_2025;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello world";
		String dup = "";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (c == str.charAt(j)) {
					System.out.print(c + " ");
					break;
				}
			}

		}

	}

}
