package basic;

public class Reverse {

	public static void main(String[] args) {
		String str1="java";
		String rev="";
		for(int i=str1.length()-1;i>=0;i--) {
			rev=rev+str1.charAt(i);
		}
		if (rev.equals(str1)) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }
    }
}
