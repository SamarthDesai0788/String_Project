package basic;

public class StringEx1 {

	public static void main(String[] args) {
        String str1="hello";
        str1=str1.concat("world");
        System.out.println(str1);
        String str2=new String("hello");
        str2.concat("World");
        str2.intern();
        System.out.println(str1==str2);
        StringBuffer buffer=new StringBuffer("java");
        buffer.append("programming");
        System.out.println(buffer);
        StringBuilder builder=new StringBuilder("java");
        builder.append(" c++");
        System.out.println(builder);
        System.out.println("str1 length "+str1.length());
        for(int i=0;i<str1.length();i++) {
        	 		System.out.println(str1.charAt(i));
        	
        }
	}
}

