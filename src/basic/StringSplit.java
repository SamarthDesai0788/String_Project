package basic;

public class StringSplit {

	public static void main(String[] args) {
		String str="Java programming language";
		String sarr[]=str.split(" ");
		for(int i=0;i<sarr.length;i++) {
			System.out.println(sarr[i]+ " index is "+i);
		}
	}
}