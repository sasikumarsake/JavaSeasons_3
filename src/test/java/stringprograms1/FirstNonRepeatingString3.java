package stringprograms1;



public class FirstNonRepeatingString3 {
	
	public static void main(String[] args) {
		

		
		findFirstNonRepeatingString("What's on the agenda today?");
	}

	private static void findFirstNonRepeatingString(String str) {
		
		str=str.toLowerCase();
		char ch;
		
		for(int i=0;i<=str.length();i++)
		{
			ch=str.charAt(i);
			
			if(str.indexOf(ch)==str.lastIndexOf(ch))
			{
				System.out.println("Non repeating charecter is : "+ch);
				break;
			}
		}
		
		
	}

}
