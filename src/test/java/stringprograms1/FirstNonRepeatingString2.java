package stringprograms1;

import java.util.Scanner;

public class FirstNonRepeatingString2 {
	
	public static void main(String[] args) {
		
		
		//BY USING THE SCANNER CLASS
		
		System.out.println("PLESE ENTER THE STRING HERE : ");
		
		Scanner input=new Scanner(System.in);
		String str= input.next();
		
		findFirstNonRepeatingString(str);
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
