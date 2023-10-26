package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;



public class ReadExcelData {

	/*public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		ReadExcelData readxsl = new ReadExcelData();
		readxsl.getdata("LoginTest");

	}*/

	@DataProvider(name="testraj")
	public String[][] getdata(Method m) throws EncryptedDocumentException, IOException
	{
	 String excelsheetname = m.getName();
	System.out.println("excelsheetnameis=" + excelsheetname);
	File fi = new File(System.getProperty("user.dir") +"\\src\\test\\resources\\testdata\\testdata.xlsx");
	FileInputStream fis = new FileInputStream(fi);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheetName = wb.getSheet(excelsheetname);
	
	int totalRows = sheetName.getLastRowNum();
	System.out.println("Totalrows="+totalRows);
	Row rowcells = sheetName.getRow(0);
	int totalcols = rowcells.getLastCellNum();
	System.out.println("totalcols="+totalcols);
	
	DataFormatter df = new DataFormatter();
	String testData[][] = new String[totalRows][totalcols];
		for (int i=1; i<=totalRows; i++)
		{
			for (int j=0; j<totalcols; j++)
			{
				testData[i-1][j] = df.formatCellValue(sheetName.getRow(i).getCell(j));
				System.out.println(testData[i-1][j]);
				
			}
		}
	
		return testData;
	
	}

}
