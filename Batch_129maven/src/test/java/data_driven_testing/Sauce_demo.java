package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sauce_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fls = new FileInputStream("D:\\employees1.xlsx");
			Workbook wb = WorkbookFactory.create(fls);
			//Sheet s = wb.getSheetName("sheet2");
			
			
			
			
			
			
			
			
			
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

	}

}
