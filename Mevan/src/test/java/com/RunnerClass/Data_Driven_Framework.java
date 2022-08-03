package com.RunnerClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Framework {
	public static Logger log = Logger.getLogger(Data_Driven_Framework.class);
	public static void parcticular_Cell() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\barat\\OneDrive\\Documents\\DataDriven.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fs);
		Sheet s = book.getSheet("Sheet1");
		Row row = s.getRow(2);
		Cell cell = row.getCell(1);
		CellType type = cell.getCellType();
		if (type.equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		} else if (type.equals(CellType.NUMERIC)) {
			double value1 = cell.getNumericCellValue();
			int a = (int) value1;
			System.out.println(a);
		}
		book.close();
	}

	public static void particular_Row() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\barat\\OneDrive\\Documents\\DataDriven.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fs);
		Sheet s = book.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(1);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				if (type.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else if (type.equals(CellType.NUMERIC)) {
					double value2 = cell.getNumericCellValue();
					int a = (int) value2;
					System.out.println(a);
				}

			}
			break;
		}
		book.close();
	}

	public static void particular_Coloumn() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\barat\\OneDrive\\Documents\\DataDriven.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fs);
		Sheet s = book.getSheet("Sheet1");
		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = s.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(1);
				CellType type = cell.getCellType();
				if (type.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else if (type.equals(CellType.NUMERIC)) {
					double value2 = cell.getNumericCellValue();
					int a = (int) value2;
					System.out.println(a);
				}
				break;
			}
		}
		book.close();
	}

	public static void all_Cell() throws IOException {
		File f = new File("C:\\Users\\barat\\OneDrive\\Documents\\DataDriven.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fs);
		Sheet s = book.getSheet("Sheet1");
		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = s.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				if (type.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.print(value + " ");
				} else if (type.equals(CellType.NUMERIC)) {
					double value2 = cell.getNumericCellValue();
					int a = (int) value2;
					System.out.print(a + " ");
				}
			}
			System.out.println();
		}
		book.close();
	}

	public static void write_Data() throws IOException {
		File f = new File("C:\\Users\\barat\\OneDrive\\Documents\\WriteData.xlsx");
		FileInputStream fs = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fs);
		book.createSheet("Sheet3").createRow(0).createCell(0).setCellValue("S No");
		book.getSheet("Sheet3").getRow(0).createCell(1).setCellValue("User Name");
		book.getSheet("Sheet3").getRow(0).createCell(2).setCellValue("Password");
		book.getSheet("Sheet3").getRow(0).createCell(3).setCellValue("Data");
		book.getSheet("Sheet3").createRow(1).createCell(0).setCellValue(1);
		book.getSheet("Sheet3").getRow(1).createCell(1).setCellValue("Barath");
		book.getSheet("Sheet3").getRow(1).createCell(2).setCellValue("Barath@998");
		book.getSheet("Sheet3").getRow(1).createCell(3).setCellValue("Username and Password Correct");
		FileOutputStream os = new FileOutputStream(f);
		book.write(os);
		book.close();
		BasicConfigurator.configure();
		log.info("Data Write Successfully");
	}

	public static void main(String[] args) throws IOException {
		write_Data();

	}
}