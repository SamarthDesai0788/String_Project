package basic;
public class CountCharacter {
	    public static void main(String[] args) {
	        String str = "amar"; 
	       for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            int count = 0;
	            for (int j = 0; j < str.length(); j++) {
	                if (str.charAt(j) == ch) {
	                    count++;
	                }
	            }
	            System.out.println("Occurrence of " + ch + " is " + count);
	        }
	    }
	}
