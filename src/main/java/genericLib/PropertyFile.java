package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	
	public String getPropertydata(String key) throws IOException 
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyfilePath);
	    p.load(fis);
	    return p.getProperty(key);
	
	}

}
