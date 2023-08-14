package Java.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.browserstack.com/");

		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
		
	   Actions a =  new Actions(driver);
	   //a.moveToElement(link);
	   
	   //a.contextClick(link);
	  // a.doubleClick(link).build().perform();
		
		
		
		

		//link.click();
	   try {
			link.click();
		}catch(Exception e) {
			
			JavascriptExecutor j= (JavascriptExecutor)driver;
		
			driver.findElement(By.xpath("//button[@class='btn col-center btn-primary btn-xl open-csf-form-v2 btn-lg custom-btn-amp-events ']"));
			driver.quit();
			
			
					
		
	


	
}
}

}