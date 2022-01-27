import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\ADMIN\\Desktop\\ks\\java\\SELEN\\MyMavenproject\\Excel\\Data.xlsx");
	
	FileInputStream st=new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(st);
	
	Sheet s = w.getSheet("Sheet1");
	Row row = s.getRow(1);
	Cell cell = row.getCell(1);
	System.out.println(cell);
	for(int i=0;i<s.getPhysicalNumberOfRows();i++)
	{
		Row row2 = s.getRow(i);
		for(int j=0;j<row2.getPhysicalNumberOfCells();j++) {
			Cell cell2 = row2.getCell(j);
			System.out.println(cell2);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
