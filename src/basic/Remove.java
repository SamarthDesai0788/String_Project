package basic;

public class Remove {

	public static void main(String[] args) {
		        String inputString = "Ezitech private limited,";
		        String charactersToRemove = "ti";
		        String result = removeCharacters(inputString, charactersToRemove);
		        System.out.println("Original String: " + inputString);
		        System.out.println("Characters to Remove: " + charactersToRemove);
		        System.out.println("Modified String: " + result);
		    }
		    public static String removeCharacters(String inputString, String charactersToRemove) {  
		        StringBuilder result = new StringBuilder();
		       for (int i = 0; i < inputString.length(); i++) {
		            char currentChar = inputString.charAt(i);
		            if (charactersToRemove.indexOf(currentChar) == -1) {
		                result.append(currentChar);
		            }
		        }
		        return result.toString();
		    }
		}


	