package stringprograms1;

import java.util.Scanner;

public class palindrome {
	
	public static void main(String[] args) {
		System.out.println("ENTER THE STRING: ");
	Scanner input =	new Scanner(System.in);
	String str=input.next();
	checkStringIsPalindrome(str);
	}

	private static void checkStringIsPalindrome(String str) {
		
		str=str.toLowerCase();
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("the string is "+rev);
		
		if (rev.equals(str)) {
			System.out.println(str+"  is a Palindrome");
			
		}
		else {
			System.out.println(str+"  is not a Palindrome");
		}
		
	}

}
