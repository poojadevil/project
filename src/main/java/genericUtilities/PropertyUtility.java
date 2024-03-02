package genericUtilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {
	private static Properties pobj = new Properties();
	static{
		try {
			FileInputStream fis = new FileInputStream(Iconstant.VtigerLoginCredential);
					pobj.load(fis);
		}catch (FileNotFoundException e) {
			
			 
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public String propertyFetch(String key)
	{
		if(key==null|| pobj.getProperty(key)==null)
		{
			throw new Exception("the value Enter in key= "+key+" Check It" );
		}
		return pobj.getProperty(key);
	}

}
