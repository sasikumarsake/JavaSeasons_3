package stringmethods;

public class StringCharMethods1 {

	public static void main(String[] args) {
		
		String s="Hello";
		
		System.out.println(s.length());
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		
		char[] ch=s.toCharArray();
		
		System.out.println(ch.length);
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		

	}

}
