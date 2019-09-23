package com.ecommerce.utilities;

//public class TestUtil {
//	
//	public static long PAGE_LOAD_TIMEOUT=10;
//	public static long IMPLICIT_WAIT=20;
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import com.qa.ecommerce.BaseClass;

public class TestUtil extends BaseClass {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	public static String TESTDATA_SHEET_PATH = "\\Users\\Anu\\Ecommercenew\\com.qa.ecommerce\\src\\main\\java\\com\\ecommerce\\testdata\\TestData.xlsx";
	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;
	


	public static Object[][] getTestDatafromexcel(String sheetName) {
		ArrayList<Object[]> mydata=new ArrayList<Object[]>();
		FileInputStream file = null;
		try {
			Properties prop = new Properties();
			
			 file = new FileInputStream("C:\\Users\\Anu\\Desktop\\States.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
//		for (int rownum = 2; rownum < reader.getRowCount("Data"); rownum++) {
//			String statename=reader.getCellData("Data", "Names", rownum);
//			String countryname=reader.getCellData("Data", "Names", rownum);
//			
//		Object ob[]= {statename,countryname};
//		mydata.add(ob);
//		}
//		return mydata;
	}
		
	}
