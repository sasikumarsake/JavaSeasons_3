package stringprograms;

import java.util.Scanner;

public class ReverseString2 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter String to be reversed ");
		Scanner input=new Scanner(System.in);
		String str=input.next();
		reverseOfString(str);
	}

	private static void reverseOfString(String str) {
	
		System.out.println(str);
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse of String is "+rev);
		
		
	}

}
