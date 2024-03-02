package genericUtilities;

import java.sql.Date;
import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtility {
	private static final String time = null;
	/*
	 *This method is used to generate a random Number 
	 *
	 */
	public int randomNumberGenerate(int range)
	{
		Random r = new Random();
		return r.nextInt(range);
		
	}
public String generateDate()
{
	Date da = new Date(0);
	String[] x= da.toString().split(" ");
	String date=x[2] +" "+ x[1]+" "+ x[5];
	return date;
}
String formatedDate;
public String GenerateCurrentTime()
{
	Date da = new Date(0);
	String[] x= da.toString().split(" ");
	System.out.println(da.toString());
	String[] time=x[3].toString().split("");
	for(String s:time)
	{
		formatedDate= s+"-"+formatedDate;
	}
	return formatedDate;
}
@Test
public void demo()
{
	System.out.println(GenerateCurrentTime());


}
}