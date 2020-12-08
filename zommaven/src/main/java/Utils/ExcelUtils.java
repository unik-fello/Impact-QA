package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtils {
	@SuppressWarnings("resource")
	@DataProvider(name = "testData")
	public static Object[][] testData() throws IOException {
		File file = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\zommaven\\Excel\\zomatoExcel.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = workbook.getSheetAt(0);

		// Row
		int rows = sheet.getLastRowNum();

		// Column
		int cols = sheet.getRow(0).getPhysicalNumberOfCells()-1;

		System.out.println("Total Rows: " + rows + " Total Columns: " + cols);

		Object[][] data = new Object[rows][cols];

		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j < cols; j++) {
				// Cell cell = sheet.getRow(i).getCell(j); ( Optimizing )
				data[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		fileInputStream.close();
		return data;
	}

	public static FileInputStream fis = null;
	public static FileOutputStream fos = null;
	public static XSSFWorkbook workbook = null;
	public static XSSFSheet sheet = null;
	public static XSSFRow row = null;
	public static XSSFCell cell = null;
	static String path;
	@SuppressWarnings("resource")
	public static void excelWrite(String xlFilePath) throws IOException {
		path=xlFilePath;
		fis = new FileInputStream(path);
		workbook = new XSSFWorkbook(fis);
		fis.close();
	}
															
	public static boolean setCellData(String sheetName, String colName, int rowNum, String value) 
	{
		try {
			int colNum = -1;
			sheet = workbook.getSheet(sheetName);
			row = sheet.getRow(0);
			for (int i = 0; i < row.getLastCellNum(); i++) { 
				if (row.getCell(i).getStringCellValue().trim().equals(colName)) 
				{
					colNum = i;
				}
			}
			row = sheet.getRow(rowNum - 1);
			if (row == null)
				row = sheet.createRow(rowNum - 1);

			cell = row.getCell(colNum);
			if (cell == null)
				cell = row.createCell(colNum);

			cell.setCellValue(value);

			fos = new FileOutputStream(path);
			workbook.write(fos);
			fos.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
		return true;
	}

}
