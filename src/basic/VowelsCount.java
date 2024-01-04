package basic;

public class VowelsCount {

	public static void main(String[] args) {
		        String str = "ezitech pvt limited!";
		        int vowels = 0;
		        int consonants = 0;
		        int specialChars = 0;
		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            if (ch >= 'a' && ch <= 'z') {
		                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                    vowels++;
		                } else {
		                    consonants++;
		                }
		            } else {
		                specialChars++;
		            }
		        }

		        System.out.println("Number of vowels: " + vowels);
		        System.out.println("Number of consonants: " + consonants);
		        System.out.println("Number of special characters: " + specialChars);
		    }
		}
