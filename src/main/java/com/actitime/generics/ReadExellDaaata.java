package com.actitime.generics;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

  public class ReadExellDaaata {
	FileInputStream fis;
	String str1;
	 static int rowcount;
	public String excelFileRead() throws IOException, Throwable, InvalidFormatException{
		 fis= new FileInputStream("./Book1.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet("sheet1");
		rowcount=sh.getLastRowNum();
	    
	    for(int i=0;i<rowcount;i++){
		Row row1=sh.getRow(i);
		str1=row1.getCell(0).getStringCellValue();
		
		
	}
	    return str1;
}
}
