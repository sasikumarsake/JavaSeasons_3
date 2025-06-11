package stringmethods;

public class StringManipulateMethods2 {

	public static void main(String[] args) {
		
		String s1= "New";
		String s2="FLM";
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s2.replace('M', 'm'));
		System.out.println(s2);
		
		String s3="Frontlines Media";
		
		System.out.println(s3.substring(11));
		
		System.out.println(s3.substring(15));
		
		System.out.println(s3.substring(5));
		
		System.out.println(s3.substring(5,10));
		
		
		
		

	}

}
