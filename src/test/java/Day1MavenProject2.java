import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day1MavenProject2 {
	public static void main(String[] args) throws IOException {
		//file Location
		File loc=new File("C:\\Users\\kalpana\\Desktop\\EclipseProgram\\MavenProject\\ExcelSheet\\MyData.xlsx");
		//To Read the value from excel
		FileInputStream stream = new FileInputStream(loc);
		
		Workbook w=new XSSFWorkbook(stream);
		
		Sheet s=w.getSheet("sheet1");
		
		//Row row=s.getRow(0);
		//Cell c=r.getCell(1);
		
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row r = s.getRow(i);
	
		for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			System.out.println(c);
			
		}
		}
		
		
	}
}


