package Java.Java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreenshot {
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.browserstack.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		
		 File scrfile = scrshot.getScreenshotAs(OutputType.FILE);
		 
		 File  Destfile = new File("C:\\Users\\HP\\eclipse\\jee-2022-09\\eclipse\\Java\\Screenshot"+ System.currentTimeMillis()+".png");
		 
		 FileUtils.copyFile(scrfile, Destfile);
		 
		
		
		
	
		
	}


	}
	
	
	
	
	


