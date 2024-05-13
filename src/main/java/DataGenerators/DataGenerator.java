package DataGenerators;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {
	
	@DataProvider(name="Static")
	public Object[][] testData() throws IOException {
		
		FileInputStream file = new FileInputStream(".\\TestData\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet loginSheet = workbook.getSheet("One");
		int numberOfData = loginSheet.getPhysicalNumberOfRows();
		Object[][] testData = new Object[numberOfData][2];
		
		for(int i=0; i<numberOfData; i++)
		{
			XSSFRow row = loginSheet.getRow(i);
			XSSFCell email = row.getCell(0);
			XSSFCell password = row.getCell(1);
			testData[i][0] = email.getStringCellValue();
			testData[i][1] = password.getStringCellValue();
		}
		return testData;
		
	}
	
	@DataProvider(name="register")
	public Object[][] testDatareg() throws IOException {
		
		FileInputStream file = new FileInputStream(".\\TestData\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet loginSheet = workbook.getSheet("reg");
		int numberOfData = loginSheet.getPhysicalNumberOfRows();
		Object[][] testData = new Object[numberOfData][5];
		
		for(int i=0; i<numberOfData; i++)
		{
			XSSFRow row = loginSheet.getRow(i);
			XSSFCell firstname = row.getCell(0);
			XSSFCell lastname = row.getCell(1);
			XSSFCell email = row.getCell(2);
			XSSFCell password = row.getCell(3);
			XSSFCell passwordconf = row.getCell(4);
			testData[i][0] = firstname.getStringCellValue();
			testData[i][1] = lastname.getStringCellValue();
			testData[i][2] = email.getStringCellValue();
			testData[i][3] = password.getStringCellValue();
			testData[i][4] = passwordconf.getStringCellValue();
			
		}
		return testData;
		
	}

}
