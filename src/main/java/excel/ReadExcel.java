package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {


	public static void main(String[] args) throws IOException {
		File filepath = new File("D://WorkSpace//Partice//src//test//resources//TestData.xlsx");
		FileInputStream inputStream = new FileInputStream(filepath);
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);
		XSSFSheet sh = wb.getSheetAt(0);
		int rowCount = sh.getLastRowNum()+1;

		for (int i = 1; i <rowCount; i++) {
			int ColCount = sh.getRow(i).getLastCellNum();

			for (int j = 0; j <ColCount; j++) {
				System.out.print(sh.getRow(i).getCell(j));
			}

			System.out.println();
		}

	}
}
