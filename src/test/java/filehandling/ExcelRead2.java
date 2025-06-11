package filehandling;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream("D:\\FLM5thDec\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		XSSFRow row=null;
		
		XSSFCell cell=null;
		
		
		for(int i=0;i<=ws.getLastRowNum();i++)
		{
			if(ws.getRow(i)!=null)
			{
				row=ws.getRow(i);
				
				for(int j=0;j<row.getLastCellNum();j++)
				{
					
					if(row.getCell(j)!=null)
					{
						
						cell=row.getCell(j);
						
						if(cell.getCellType()==CellType.STRING)
						{
							System.out.println(cell.getStringCellValue()+" is a String ");
						}
						else if(cell.getCellType()==CellType.NUMERIC)
						{
							System.out.println(cell.getNumericCellValue()+" is a Number ");
						}
						else if(cell.getCellType()==CellType.BOOLEAN)
						{
							System.out.println(cell.getBooleanCellValue()+" is a boolean ");
						}
					}
					
				}
				
			}
		}
		
		
		wb.close();

	}

}
