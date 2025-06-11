package stringprograms1;


import java.util.Scanner;

public class CharacterOccurencesByChatGPTGiven {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string here: ");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine().toLowerCase();
		
		int[] count=new int[256];
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			count[ch]++;
		}
		
		System.out.println("The Character Occurenecs is: ");
		for(int i=0;i<count.length;i++)
		{
		if(count[i]>0 && (char)i !=' ')
		{
			System.out.println((char)i + " -> " + count[i]);
		}
		}
	}

}
