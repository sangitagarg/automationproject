package com.actitime.genericlib;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.util.Properties;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	public class FileLibClass {
	public static	String ppath="./data/new.properties";
		public static String epath="./data/testcases.xlsx";
		public String getpropertyvalue(String key) throws Throwable{
			FileInputStream fis= new FileInputStream(ppath);
			Properties pobj=new Properties();
			pobj.load(fis);
			String data=pobj.getProperty(key);
			return data;
		}
		public static String getexceldata(String Sheetname, int rownum, int cellnum) throws Throwable{
			FileInputStream fis= new FileInputStream(epath);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet sh=wb.getSheet(Sheetname);
			Row row=sh.getRow(rownum);
			Cell cel=row.getCell(cellnum);
			String data=cel.getStringCellValue();
			return data;
		}
	public void setexceldata(String Sheetname, int rownum, int cellnum, String data) throws Throwable{
		FileInputStream fis= new FileInputStream(epath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(Sheetname);
		Row row=sh.getRow(rownum);
		Cell cel=row.getCell(cellnum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(epath);
		wb.write(fos);
		wb.close();
	}
	public String getpropertykeyvalue(String string){
		return null;
	}
	}
