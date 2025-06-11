package stringprograms;

import java.util.Scanner;

public class ReverseNumber {
	
	// 123 ==> 321 
	//120  ==> 21 
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter number to be reversed ");
		//to scan int form console 
		
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		reverseOfNumber(num);
	}

	private static void reverseOfNumber(int num) {
		
		System.out.println(num);
		
		/*
		 * for(int i=0;i<=2;i++) { System.out.print(num%10); num=num/10; }
		 */
		
		int rev=0;
		
		while(num>0)
		{                                     //     		 it1   it2   it3
			rev=rev*10+num%10;  //rev       3    32   321
			num=num/10;             //num        12  1     0
		}
		
		
		System.out.println("Reverse of number is "+rev);
	}
	

}
