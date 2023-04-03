package sample1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataFromExcel {

	public static void main(String[] args) throws BiffException, IOException {
		
		FileInputStream f = new FileInputStream("C:\\Users\\91801\\Desktop\\Testingfile.xls");
        
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet s = wb.getSheet("Sheet1");
		
		System.out.println(s.getCell(0, 0).getContents());
		System.out.println(s.getCell(0, 1).getContents());
		System.out.println(s.getCell(0, 2).getContents());
	}

}
