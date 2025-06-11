package stringmethods;

public class StringCheckMethods {

	public static void main(String[] args) {
		
		//using literals 
		
		String s1="FLM";
		
		String s2="flm";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3="new FLM";
		
		System.out.println(s3.contains(s1));  //true
		
		System.out.println(s1.contains(s3));  //false
		
		System.out.println(s3.endsWith(s1)); //true
		
		System.out.println(s3.startsWith("new")); //true
		
		System.out.println(s3.startsWith(s1, 4)); //true
		
		
		
		
		
		
		
		
		
		

	}

}
