package stringprograms1;



public class NoNonRepeatingString {
	
	public static void main(String[] args) {
		

		
		findFirstNonRepeatingString("AA BB CC DD EE FF");
	}

	private static void findFirstNonRepeatingString(String str) {
		
		str=str.toLowerCase();
		char ch;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			
			if(str.indexOf(ch)==str.lastIndexOf(ch))
			{
				System.out.println("Non repeating charecter is : "+ch);
				break;
			}
			if (i==str.length()-1) {
				System.out.println("No non repeating charecter in the given string.!");
			}
		}
		
		
	}

}
