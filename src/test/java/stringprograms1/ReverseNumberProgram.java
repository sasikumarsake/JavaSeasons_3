package stringprograms1;

import java.util.Scanner;

public class ReverseNumberProgram {
	public static void main(String[] args) {
		
		
		//123   321
		//120   21     because zero is not valid 
		
		System.out.println("Please enter your input number :");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		ReverseOfNumber(num);
	}

	//this is for good practice purpose
	private static void ReverseOfNumber(int num) {
		
		System.out.println(num);
		
		for(int i=0;i<=2;i++)
		{
			//System.out.println(num%10); //idhi line by line lo print avuthundhi
			System.out.print(num%10); //idhi oke line lo print avuthundhi.
			num=num/10;
			
			//7305672225 scopethinkers
		}
		
	}

}
