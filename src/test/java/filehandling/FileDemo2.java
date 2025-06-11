package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("D:\\FLM5thDec\\Mar19th.txt");
		
		f1.createNewFile();
		
		System.out.println("End of program...");
		

	}

}
