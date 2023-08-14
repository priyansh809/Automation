import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import Helper.WebDriverHelper;

public class Browserinitialization  {
	
	public static void main (String[] args) {
		
		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods

		// Chrome

		         ChromeOptions options = new ChromeOptions();

		         options.addArguments("--remote-allow-origins=*");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\Browser\\edgedriver_win64");

		WebDriver driver = new ChromeDriver(options);



		//Firefox

		//System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

		//WebDriver driver1 = new FirefoxDriver();

		//Microsoft Edge

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Documents\\Browser\\edgedriver_win64");

		WebDriver driver1 = new EdgeDriver();

		driver1.get("https://rahulshettyacademy.com");

		System.out.println(driver1.getTitle());

		System.out.println(driver1.getCurrentUrl());

		driver1.close();
		
	}
}

		//driver.quit();