package basic;

public class RemoveParticular {

	public static void main(String[] args) {
		              String str = "India is my country";  
		              System.out.println(removeCharcter(str, 7)); 
		              System.out.println(removeCharcter(str,6));
		            
		           }  
		           public static String removeCharcter(String str, int p) {  
		              return str.substring(0, p) + str.substring(p + 1);  
		           }  
		}  
	
