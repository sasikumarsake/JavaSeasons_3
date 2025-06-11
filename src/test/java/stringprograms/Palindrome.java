package stringprograms;

import java.util.Scanner;

public class Palindrome {
	
public static void main(String[] args) {
		
		System.out.println("Enter String ");
		Scanner input=new Scanner(System.in);
		String str=input.next();
		checkStringIsPalindrome(str);
	}

	private static void checkStringIsPalindrome(String str) {
		
		str=str.toLowerCase();
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse of String is "+rev);
		
		
		if(rev.equals(str))
		{
			System.out.println(str+" is  a palindrome ");
		}
		else
		{
			System.out.println(str+" is  not a palindrome ");
		}
		
		
		
	}
	
}
