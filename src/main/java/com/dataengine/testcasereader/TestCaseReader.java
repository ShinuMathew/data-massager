package com.dataengine.testcasereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.dataengine.variable.CommonVariables;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class TestCaseReader {

	public static XSSFWorkbook workbook;
	public static Sheet sheet;
	public static String tcDoc = "/Users/ecom-shinu.mathew/Documents/Insight10/InsightTC.csv";

	public static void readCSV() {
		try {
			File fname = new File(tcDoc);
			FileReader filereader = new FileReader(fname);
			CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
			List<String[]> allData = csvReader.readAll();
			for (String[] row : allData) {
				for (String cell : row)
					System.out.print(cell + "\t");
				System.out.println();
			}
		} catch (Exception ex) {
		}
	}

	public static void readExcel() {
		try {
			File fname = new File(tcDoc);
			FileInputStream fis = new FileInputStream(fname);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(CommonVariables.TCName);
			StringBuilder sb = new StringBuilder(sheet.getRow(1).getCell(0).toString());
			String test = sheet.getRow(1).getCell(0).toString().replace(".0", "");
			System.out.println(test);
			Iterator<Row> rowIterator = sheet.rowIterator();
			DataFormatter dataformat = new DataFormatter();
			while (rowIterator.hasNext()) {
				System.out.println("----------------");
				Row row = rowIterator.next();
				System.out.println(row.getCell(0) + "  ||  " + row.getCell(1) + "  ||  " + row.getCell(2) + "  ||  "
						+ row.getCell(3) + "  ||  " + row.getCell(4));
				System.out.println("----------------");
			}
		} catch (Exception ex) {
			System.out.println("Following exception occured while reading test case. " + ex.getMessage());
		}
	}
}