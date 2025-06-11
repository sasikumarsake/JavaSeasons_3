package stringprograms1;

import java.util.Scanner;

public class ReverseStringProgram2 {
	public static void main(String[] args) {
		
		System.out.println("Enter the name which is reversed:");
		Scanner input=new Scanner(System.in);
		String stringName=input.nextLine();  // remove spaces/punctuation while reversing 
		ReverseOfString(stringName);
	}

	private static void ReverseOfString(String str) {
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("The Reverse of string is:"+rev);
	}

}
