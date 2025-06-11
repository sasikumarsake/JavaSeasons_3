package stringprograms;

public class OccurenceOfCharInString {
	
	public static void main(String[] args) {
		
		toFindOccuranceOfCharactersInString("Hello");
		
	}

	private static void toFindOccuranceOfCharactersInString(String str) {
		
		char ch;
		int count=1;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(j)==ch)
				{
					count++;
				}
			}
			
			System.out.println(ch+" occured "+count+" times");
			
		}
		
		
	}

}
