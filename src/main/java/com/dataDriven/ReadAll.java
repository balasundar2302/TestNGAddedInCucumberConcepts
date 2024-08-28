package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAll {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\lenovo\\OneDrive\\readParticular.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheet.getRow(i); //1st row, 2nd row, 3rd row
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();  //all cell data
			for (int j = 0; j < physicalNumberOfCells; j++) {
					Cell cell = row.getCell(j);   //1st cell (0th index) ,2nd cell (1st index)
					CellType cellType = cell.getCellType();
					if (cellType.equals(cellType.STRING)) {
						String stringCellValue = cell.getStringCellValue();
						System.out.println(stringCellValue);
					}
					else if (cellType.equals(CellType.NUMERIC)) {
						double numericCellValue = cell.getNumericCellValue();
						int intValue=(int)numericCellValue;
						System.out.println(intValue);  //1st cell completed, 2nd cell completed
					}
			}
			
		}
	}

}
