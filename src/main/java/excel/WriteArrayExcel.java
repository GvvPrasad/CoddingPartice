package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteArrayExcel {

	static int[][] arr = { 
			{1, 2, 3}, 
			{4, 5, 6, 9}, 
			{7},
			{0,5,7}
			};

	public static void main(String[] args) throws IOException {
		File filepath = new File("D://WorkSpace//Partice//src//test//resources//TestData.xlsx");
		FileOutputStream fileOut = new FileOutputStream(filepath);
		Workbook wb = new XSSFWorkbook();
		XSSFSheet sh = (XSSFSheet) wb.createSheet("array");

		Row[] row = new Row[arr.length];
		Cell[][] cell = new Cell[row.length][];

		for(int i = 0; i < row.length; i ++)
		{
			row[i] = sh.createRow(i);
			cell[i] = new Cell[arr[i].length];

			for(int j = 0; j < cell[i].length; j ++)
			{
				cell[i][j] = row[i].createCell(j);
				cell[i][j].setCellValue(arr[i][j]);
			}

		}

		//Export Data
		wb.write(fileOut);
		fileOut.close();
		System.out.println("File exported successfully");
	}

}
