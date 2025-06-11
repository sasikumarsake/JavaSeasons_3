package stringmethods_1;

public class StringCharMethods1 {
	public static void main(String[] args) {
		
		String s = "Hello";
		//approach 1
		for(int i=0; i<=s.length()-1; i++)
		{
			System.out.println(s.charAt(i));
		}
		
		//approach 2
		for(int j=0; j<s.length();j++)
		{
			System.out.println(s.charAt(j));
		}
		
		//approach 3
		
		char[] ch=s.toCharArray();
		
		//System.out.println(ch.length());
		System.out.println(ch.length);
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}

}
