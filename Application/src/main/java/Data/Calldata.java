package Data;

import java.io.IOException;
import java.util.ArrayList;

public class Calldata {
	public static void main(String[]args) throws IOException
	{
		Excelfiledata a  = new Excelfiledata();
		ArrayList al = a.filedata("");
System.out.println(al.get(0));
System.out.println(al.get(1));
//		System.out.println(al);
	}

}
