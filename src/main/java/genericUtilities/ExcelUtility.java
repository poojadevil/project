package genericUtilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	private DataFormatter df = new DataFormatter();
	private FileInputStream fis;
	private Workbook book;
	private Sheet sh;
	List<String> l = new ArrayList(<String>);
	 public String fetchSingleData(String path,String shName, int row, int cell)
	 {
		 fis = new FileInputStream(path);
		 book = WorkbookFactory.create(fis);
		 return df.formatCellValue(book.getSheet(shName).getRow(row).getCell(cell));
		 
	 }
public int LastRowNumber(String path,String shName)throws Throwable
{
	fis = new FileInputStream(path);
	book = WorkbookFactory.create(fis);
	sh = (Sheet) book.getSheet(shName);
	return sh.getLastRowNum();
}
public List<String> fetchSingleInRowWise(String path,String shName,int row,int cell)throws Throwable
{
	fis = new FileInputStream(path);
	book = WorkbookFactory.create(fis);
	Sheet sh= (Sheet) book.getSheet(shName);
	int lastRow= sh.getLastRowNum();
	
	for(int i=0;i<=lastRow;i++)
	{
		String data= df.formatCellValue(sh.getRow(row).getCell(cell));
		List<String> l;
		l.add(data);
	}
	return l;
	}
}
	

	

