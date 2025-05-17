package data_drn_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Fb {

		public String getExcelData(String shettname, int rownum, int cellnum)
		{
			String retval = null;
			try {
				FileInputStream fis = new FileInputStream("D:\\employees1.xlsx");
				Workbook wb = WorkbookFactory.create(fis);

				Sheet s = wb.getSheet("Sheet1");
				Row r = s.getRow(rownum);
				Cell c = r.getCell(cellnum);
				String te = c.getStringCellValue();
				System.out.println(te);



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