package stringmethods_1;

public class StringDemo1 {
	public static void main(String[] args) {
		
		//using literals
		
		String s1="FLM";
		
		String s2="FLM";
		
		String s3=new String("FLM");
		
		System.out.println(s1==s2); //true
		
		System.out.println(s1==s3); //false
		
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		
		
		// == is used for checking the references
		// equals is used for checking the content
		
	}

}
