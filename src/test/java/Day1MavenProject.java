import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Day1MavenProject {
	public static void main(String[] args) throws IOException {
		//file Location
		File loc=new File("C:\\Users\\kalpana\\Desktop\\EclipseProgram\\MavenProject\\ExcelSheet\\MyData.xlsx");
		//To Read the value from excel
		FileInputStream stream = new FileInputStream(loc);
		
		Workbook w=new XSSFWorkbook(stream);
		
		Sheet s=w.getSheet("sheet1");
		
		int getPhysicalNumberOfRows=s.getPhysicalNumberOfRows();
        System.out.println(getPhysicalNumberOfRows);        
        
		Row r=s.getRow(1);
		int physicalNumberOfCells = r.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);
		
			
		Cell c=r.getCell(1);
		
		System.out.println(c);
		
		
	}


}
