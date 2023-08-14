package Java.Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class property {
	Properties Prop;

	@Test
	public void configReader() throws IOException {
		
		Prop = new Properties();
		
		File src = new File("C:\\Users\\HP\\eclipse\\jee-2022-09\\eclipse\\Java\\DOC\\Employeeinfo.properties");
		try {
			FileInputStream file = new FileInputStream(src);
			Prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(Prop.getProperty("url"));
		
		driver.manage().window().maximize();
	}	
	
}	

		
		
		
	
	
	

