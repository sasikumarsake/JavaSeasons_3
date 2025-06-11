package stringprograms1;

import java.util.Scanner;

public class ReverseNumberProgram2 {
	public static void main(String[] args) {
		
		
		//123   321
		//120   21     
		
		System.out.println("Please enter your input number :");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		ReverseOfNumber(num);
	}

	//this is for good practice purpose
	private static void ReverseOfNumber(int num) {
		
		int rev=0;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
		System.out.println("The Reverse is number is: "+rev);
		
	}

}
