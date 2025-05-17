package data_drn_testing;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_library {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("D:\\employees1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet("Sheet1");
			Row r = s.getRow(1);
			Cell c = r.getCell(1);
			String te = c.getStringCellValue();
			System.out.println(te);
				
				
				
				
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}

