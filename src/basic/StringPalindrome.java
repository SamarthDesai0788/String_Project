package basic;

public class StringPalindrome {

	public static void main(String[] args) {
		       String input = "madam";
		        if (isPalindrome(input)) {
		            System.out.println(input + " is a palindrome.");
		        } else {
		            System.out.println(input + " is not a palindrome.");
		        }
		    }
		    public static boolean isPalindrome(String input) {
		        StringBuffer reversed = new StringBuffer(input).reverse();
		        String reversedString = reversed.toString();
		        return input.equalsIgnoreCase(reversedString);
		    }
		}


