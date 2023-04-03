package sample1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataFromExcel1 {

	public static void main(String[] args) throws BiffException, IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\91801\\Desktop\\Testingfile.xls");
		
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet s = wb.getSheet("Sheet1");
		
		int columncount = s.getColumns();
		int rowcount = s.getRows();
		for(int i=0;i<rowcount;i++)
		{
			for(int j=0;j<columncount;j++)
			{
				System.out.print(s.getCell(j,i).getContents()+" ");
			}
			System.out.println();
	}

}}
