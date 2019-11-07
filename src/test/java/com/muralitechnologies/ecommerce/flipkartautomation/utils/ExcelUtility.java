package com.muralitechnologies.ecommerce.flipkartautomation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static XSSFWorkbook WorkBook;
	private static XSSFSheet ExcelSheet;
	private static XSSFRow Row;
	private static XSSFCell Cell;

	public static void getSheetValue(String Location) throws IOException {

		try {
			FileInputStream excelfile = new FileInputStream(Location);
			WorkBook = new XSSFWorkbook(excelfile);
			ExcelSheet = WorkBook.getSheet("DemoSheet");
			System.out.println("Sheet === :" + ExcelSheet);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			getSheetValue("E:\\Java&Eclipse\\DemoBook.xlsx");
			Cell = ExcelSheet.getRow(RowNum).getCell(ColNum);
			String cellData = Cell.getStringCellValue();
			return cellData;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public static void setCellData(String data, int RowNum, int ColNum) throws Exception {

		Cell = ExcelSheet.getRow(RowNum).getCell(ColNum);

		if (Cell == null) {
			Cell = ExcelSheet.getRow(RowNum).createCell(ColNum);
			Cell.setCellValue(data);
		} else {
			Cell.setCellValue(data);
		}

		FileOutputStream fileOut = new FileOutputStream("E:\\Java&Eclipse\\DemoBook.xlsx");
		WorkBook.write(fileOut);
		fileOut.flush();
		fileOut.close();

	}

	public static void main(String args[]) throws Exception {
		ExcelUtility excel = new ExcelUtility();
		excel.getSheetValue("E:\\Java&Eclipse\\DemoBook.xlsx");
		System.out.println(excel.getCellData(0, 1));
		excel.setCellData("PASS", 0, 2);
	}

}
