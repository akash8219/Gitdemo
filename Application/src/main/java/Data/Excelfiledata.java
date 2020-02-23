package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfiledata {
	public ArrayList filedata(String header) throws IOException
	{
		ArrayList al = new ArrayList();
		FileInputStream fis = new FileInputStream("E:\\E Folder-Akash\\SeleniumInputData\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int col=0,k=0;
		String result="";
		int numeric;
		int sheetno=wb.getNumberOfSheets();
		for(int i=0;i<sheetno;i++)
		{
			XSSFSheet sht=wb.getSheetAt(i);
			Iterator<Row>ritr= sht.iterator();
			Row frow=ritr.next();
			Iterator<Cell>citr= frow.cellIterator();
			while(citr.hasNext())
			{
				Cell fcell=citr.next();
				if(fcell.getStringCellValue().equals(header))
				{
					k=col;
				}
				col++;
			}
			System.out.println("Header name is " +frow.getCell(k).getStringCellValue());
			while(ritr.hasNext())
			{
				Row r = ritr.next();
			Iterator<Cell>c1=r.iterator();
			while(c1.hasNext())
			{
				 XSSFCell cell = (XSSFCell) c1.next();
                 double Value;
                 int newval;
                 if(cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
                  Value=cell.getNumericCellValue();
                 newval=(int) (Value/1);
      //         System.out.println(newval);
                 al.add(newval);
                 }
                  else if(cell.getCellType()==cell.CELL_TYPE_STRING)
                  {
                	  result=cell.getStringCellValue();
        //        	  System.out.println(result);
                	  al.add(result);
                  }
                 
		}
		
				}
		
	}
		return al;
	
	}
}
