package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excellibrary {

	public String getexceldata(String sheetName, int rowNum , int cellNum) {
		// TODO Auto-generated method stub
		String retval = null;
		
		try {
			FileInputStream fls = new FileInputStream("D:\\employees1.xlsx");
			Workbook wb = WorkbookFactory.create(fls);
			Sheet s =wb.getSheet(sheetName);
			Row r = s.getRow(rowNum);
			Cell c =r.getCell(cellNum);
			retval = c.getStringCellValue();
			//System.out.println(te);
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retval;

	}

}
