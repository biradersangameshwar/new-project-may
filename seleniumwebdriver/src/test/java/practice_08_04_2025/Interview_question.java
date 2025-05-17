package practice_08_04_2025;

public class Interview_question {

	public static void main(String[] args) {
		String input = "abcd";
		String otput = duplicateCharacters(input);
		System.out.println(input);
		System.out.println(otput);
		

	}

	private static String duplicateCharacters(String input) {
		StringBuilder result = new StringBuilder();
		for(char c:input.toCharArray()) {
			 result = result.append(c).append(c);
		}
		
		return result.toString();
		
	}

}
