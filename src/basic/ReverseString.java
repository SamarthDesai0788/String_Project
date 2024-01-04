package basic;

public class ReverseString {

	public static void main(String[] args) {
		        String inputSentence = "Hello World Java Program";
		        String reversedSentence = reverseWords(inputSentence);
		        System.out.println("Original Sentence: " + inputSentence);
		        System.out.println("Reversed Sentence: " + reversedSentence);
		    }

		    public static String reverseWords(String sentence) {
		  		        String[] words = sentence.split("\\s+");
		  	 StringBuilder reversed = new StringBuilder();
		        for (int i = words.length - 1; i >= 0; i--) {
		            reversed.append(words[i]);
		            if (i > 0) {
		                reversed.append(" "); 
		            }
		        }
		        return reversed.toString();
		    }
		}

	