package stringmethods;

public class StringManipulateMethods1 {

	public static void main(String[] args) {
		
		String s1= "       Frontlines Media: Largest Telugu Student Community ";
		
		System.out.println(s1);
		System.out.println(s1.trim());
		
		String s2="chrome";
		String s3="Chrome";
		String s4="CHROME";
		
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toUpperCase());
		
		
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s4.toLowerCase());
		

	}

}
