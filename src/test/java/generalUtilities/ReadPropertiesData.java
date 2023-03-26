package generalUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesData
{
	static FileInputStream myfile;
	static Properties prop;
	String file;
	public ReadPropertiesData(String filePath)
	{
		file = filePath;
	}
	public String readData(String key) //throws IOException
	{		
		try {
			myfile = new FileInputStream(file);
			prop = new Properties(); // news reader
			prop.load(myfile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//news papaer
		
		String a = prop.getProperty(key);
		return a;
	}

}
