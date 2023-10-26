package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Readpropertyfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("E:\\Practice\\AutomationFramework\\AutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
		Properties pr = new Properties();
		pr.load(fr);
		
		System.out.println(pr.getProperty("browser"));
		System.out.println(pr.getProperty("testurl"));

	}

}
