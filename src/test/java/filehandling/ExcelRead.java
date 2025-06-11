package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream("D:\\FLM5thDec\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int lastRowNumber=ws.getLastRowNum();
		
		System.out.println("getLastRowNum "+lastRowNumber);
		
		int noOfRows=ws.getPhysicalNumberOfRows();
		
		System.out.println("getPhysicalNumberOfRows  "+noOfRows);
		
		XSSFRow  row=ws.getRow(0);
		
		int lastCellNumber=row.getLastCellNum();
		
		System.out.println("lastCellNumber "+lastCellNumber);
		
		int physicalNumberOfCells= row.getPhysicalNumberOfCells();
		
		System.out.println("physicalNumberOfCells "+physicalNumberOfCells);
		
		XSSFCell  cell=row.getCell(0);
		
		System.out.println(cell);
		
		System.out.println(cell.getCellType());
		
		wb.close();

	}

}
