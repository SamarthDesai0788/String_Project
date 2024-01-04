package basic;
import java.util.*;
public class Vowels {
	static String print_next_vovel_String(char []str) {
	    HashMap<Character,Integer> m = new HashMap<Character,Integer>();
	    m.put('a', 0);
	    m.put('e', 1);
	    m.put('i', 2);
	    m.put('o', 3);
	    m.put('u', 4);
	    char arr[] = { 'a', 'e', 'i', 'o', 'u' };
	    int N = str.length;
	 	    for(int i = 0; i < N; i++)
	    {
	        char c = str[i];
	        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
	        {
	            int index = m.get(c) + 1;
	            int newindex = index % 5;
	            str[i] = arr[newindex];
	        }
	    }
	    return String.valueOf(str);
	}
	public static void main(String[] args)
	{
	    String str = "Hello";
	    System.out.print(print_next_vovel_String(
	        str.toCharArray()));
	}
}