package com.ShoppersStack.GU;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {

	FileInputStream fis;
	
	public String readPropertyData(String key) throws IOException 
	{
		fis = new FileInputStream(FrameWork_Constant.propertyFilepath);
		Properties pro = new Properties();
		pro.load(fis);
		  String value = pro.getProperty(key);
		  return value;
	}

	public String readExcelData(String sheetNum , int rowNum , int cellNum) throws EncryptedDocumentException, IOException
	{
		fis= new FileInputStream(FrameWork_Constant.excelFilePath);
		Workbook wb = WorkbookFactory.create(fis); 
	String value = wb.getSheet(sheetNum).getRow(rowNum).getCell(cellNum).getStringCellValue();
	
	return value;
	}
}
