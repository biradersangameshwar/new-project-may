package day1;

public class Rev {

	
	    public static void main(String[] args) {
	        String s = "sangam";
	        String reversedUnique = "";

	        // Step 1: Traverse string in reverse order
	        for (int i = s.length() - 1; i >= 0; i--) {
	            char current = s.charAt(i);
	            boolean found = false;

	            // Step 2: Check if character is already added to result
	            for (int j = 0; j < reversedUnique.length(); j++) {
	                if (current == reversedUnique.charAt(j)) {
	                    found = true;
	                    break;
	                }
	            }

	            // Step 3: If not found, append to result
	            if (!found) {
	                reversedUnique += current;
	            }
	        }

	        System.out.println("Reversed string without duplicates: " + reversedUnique);
	    }
	}

		
		
		
		
		/*int len = s.length();
		String rev = "";
        for(int i=len-1;i>0;i--) {
        	rev=rev+s.charAt(i);
        }
        System.out.println(rev);
	}*/

