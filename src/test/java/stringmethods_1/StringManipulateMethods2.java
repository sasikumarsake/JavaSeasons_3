package stringmethods_1;


public class StringManipulateMethods2 {

	public static void main(String[] args) {
		String s1="Frontlines Media: Largest Telugu Student Community "; 
		String s2="Automation Testing";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.replace("M", "m"));
		
		String s3="New FLM Media";
		
		System.out.println(s3.substring(10));
		System.out.println(s3.substring(12));
		System.out.println(s3.substring(4, 7));
	}
	
}
