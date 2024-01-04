package basic;

public class StringSplitex1 {
	public static void main(String[] args) {
		String str="Java programming ";
		String sarr[]=str.split(" ");
		String rev=" ";
		for(int i=0;i<sarr.length;i++) {
			for(int j=sarr[i].length()-1;j>=0;j--) {
				rev+=sarr[i].charAt(j);
			}
			System.out.println(rev);
			
	}
	}

}
