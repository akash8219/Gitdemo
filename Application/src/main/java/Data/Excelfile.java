package Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfile {
	public static void main(String[]args) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Akash\\Desktop\\Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		int k=0,column=0;
		int rowcount=0,colcount=0;
		String result="";
		int sheet = wb.getNumberOfSheets();
		for(int i=0;i<sheet;i++)
		{
		    XSSFSheet ab = wb.getSheetAt(i);
		    Iterator<Row>ritr =ab.iterator();
		     Row frow= ritr.next();
		   Iterator<Cell>citr=frow.iterator();
		   while(citr.hasNext())
		   {
			  Cell value= citr.next();
			  if(value.getStringCellValue().equals("UserName"))
					{
						k=colcount;
					}	
					colcount++;
				}			
				System.out.println("Column value is"+k);	
				
				while(ritr.hasNext())
				{
					Row r = ritr.next();
					Iterator<Cell>c1=r.iterator();
					while(c1.hasNext())
					{
						XSSFCell cell= (XSSFCell)c1.next();
						double value;
						int newval;
						if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
						{
							value=cell.getNumericCellValue();
							newval= (int)(value/1);
							System.out.println(newval);
						}
						if(cell.getCellType()==cell.CELL_TYPE_STRING)
						{
							result = cell.getStringCellValue();
							System.out.println(result);
						}
					}
//					result=r.getCell(k).getStringCellValue();
//					System.out.println(result);
					}
					
					
					
				}
		
		
		   }
	         
	 
		}
		
		
		
	


