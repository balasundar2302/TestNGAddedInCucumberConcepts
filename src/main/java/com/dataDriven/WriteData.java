package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\lenovo\\OneDrive\\Documents\\WriteDatas.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
//		wb.getSheet("Sheet1").createRow(0).createCell(0).setCellValue("username");
		wb.createSheet("Sheet2").createRow(0).createCell(0).setCellValue("username");
		wb.getSheet("Sheet2").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("Sheet2").createRow(1).createCell(0).setCellValue("Whatsapp@123");
		wb.getSheet("Sheet2").getRow(1).createCell(1).setCellValue("123456");
		
		wb.createSheet("Sheet3").createRow(0).createCell(0).setCellValue("username");
		wb.getSheet("Sheet3").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("Sheet3").createRow(1).createCell(0).setCellValue("Insta@123");
		wb.getSheet("Sheet3").getRow(1).createCell(1).setCellValue("11223344");
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		
		
	}
}
