package stringprograms;

public class FirstNonRepeatCharacter {
	
	public static void main(String[] args) {
		
		
		findFirstNonRepeatingCharacter("aa bb cc dd");
		
	}

	private static void findFirstNonRepeatingCharacter(String str) {
		
		str=str.toLowerCase();
		 char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			
			if(str.indexOf(ch)==str.lastIndexOf(ch))
			{
				System.out.println("Non repeating character is "+ch);
				break;
			}
			
			if(i==str.length()-1)
			{
				System.out.println("No non repeating characters in the given String");
			}
			
		}
		
	}

}
