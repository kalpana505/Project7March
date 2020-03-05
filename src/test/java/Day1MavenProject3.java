import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Day1MavenProject3 {
	public static void main(String[] args) throws IOException {
		//file Location
		File loc=new File("C:\\Users\\kalpana\\Desktop\\EclipseProgram\\MavenProject\\ExcelSheet\\MyData.xlsx");
		//To Read the value from excel
		FileInputStream stream = new FileInputStream(loc);
		//Select type of workbook
		Workbook w=new XSSFWorkbook(stream);
		//select a sheet name
		Sheet s=w.getSheet("Sheet1");
		
		Row r = s.getRow(1);

		Cell c = r.getCell(1);
		
		System.out.println("Before type method:"+c);
		
		int cellType = c.getCellType();
		System.out.println("cell type:" +cellType);
		
		if(cellType==1) {
			
			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);
			System.out.println("hi kalpana");
		}
		
		else if(cellType==0) {
			if(DateUtil.isCellDateFormatted(c)) {
			Date dateCellValue = c.getDateCellValue();
			System.out.println(dateCellValue);
			SimpleDateFormat s1=new SimpleDateFormat("dd-MM-yyyy");
			String format = s1.format(dateCellValue);
			System.out.println(format);
		}
			else {
				double numericCellValue = c.getNumericCellValue();
				long l=(long) numericCellValue;
				String valueOf = String.valueOf(l);
				System.out.println(valueOf);
							
			}
			
	}


}
}
