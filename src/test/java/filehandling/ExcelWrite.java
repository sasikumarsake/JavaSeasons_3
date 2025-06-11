package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream("D:\\FLM5thDec\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//Case 1 : modifying an existing cell 
		
		//ws.getRow(2).getCell(0).setCellValue("Riyaz");
		
		//Case 2: Creating a cell in existing row 
		
		//ws.getRow(2).createCell(1).setCellValue(789);
		
		
		//Case 3: Creating a Row and Cell in it 
		ws.createRow(3).createCell(0).setCellValue("Rest Assured");
		
		
		
		FileOutputStream fos=new FileOutputStream("D:\\FLM5thDec\\Book1.xlsx");
		
		wb.write(fos);
		
		wb.close();

	}

}
