package stringprograms1;

public class OccurenceOfCharInString {

	public static void main(String[] args) {

		toFindOccurencesofCharectersinString("Sasikumar");
	}

	private static void toFindOccurencesofCharectersinString(String str) {

		
		char ch;
		int count=1;
		
		for(int i=0; i<str.length(); i++)
		{
			 ch=str.charAt(i);
			 
			 for(int j=i+1;j<str.length();j++)
			 {
				 if(str.charAt(j)==ch)
				 {
					 count++;
				 }
			 }
			 System.out.println(ch+ " is occured "+count+ " times .!");
		}
	}
}
