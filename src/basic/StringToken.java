package basic;
import java.util.*;
public class StringToken {

	public static void main(String[] args) {
	
		StringTokenizer st=new StringTokenizer("hello world program");
		System.out.println(st.hasMoreTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
