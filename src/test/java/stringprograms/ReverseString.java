package stringprograms;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter String to be reversed ");
		Scanner input=new Scanner(System.in);
		String str=input.next();
		reverseOfString(str);
	}

	private static void reverseOfString(String str) {
	
		System.out.println(str);
		
		StringBuilder sb1=new StringBuilder(str);
		
		System.out.println(sb1.reverse());
		
		
	}

}
