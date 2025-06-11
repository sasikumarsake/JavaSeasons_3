package filehandling;

import java.io.File;
import java.io.IOException;

public class FolderDemo1 {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("D:\\FLM5thDec\\reports");
		
		System.out.println(f1.mkdir());	
		
		System.out.println("End of program...");
		

	}

}
