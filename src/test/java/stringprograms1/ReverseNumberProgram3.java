package stringprograms1;

import java.util.Scanner;

public class ReverseNumberProgram3 {
	public static void main(String[] args) {
		
		System.out.println("Enter reversed number here:");
		Scanner input=new Scanner(System.in);
		long num=input.nextLong();
		ReversedOfNumber(num);
	}

	private static void ReversedOfNumber(long num) {
		
		long rev=0;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("the final reversed number is:"+rev);
	}

}
