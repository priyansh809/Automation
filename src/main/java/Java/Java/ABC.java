package Java.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABC {
	
	public static void main (String[]argus) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement userInputField=driver.findElement(By.xpath("//input[@id='user-name']"));

		userInputField.sendKeys("standard_user");
	
		  WebElement passwordField=driver.findElement(By.xpath("//input[@id='password']"));
		  passwordField.sendKeys("secret_sauce");
		  

		  WebElement loginButton= driver.findElement(By.xpath("//input[@id='login-button']"));
		  
		     loginButton.click();
		     
		 
		     
		 //WebElement ele =  driver.findElement(By.xpath("select_container"));
		 Select se = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		
		  se.selectByIndex(0);
		  
		  Thread.sleep(3000);
		  
		  
	se.selectByValue("za");
		     
se.selectByVisibleText("Name(Z to A)");

Thread.sleep(3000);

   se.selectByValue("hilo");

se.selectByVisibleText("high to low");
		  
		 
	
		
		
	
		
		
	   
		     
		  
		  
		  
		 
		  
		   
		   
		   
		   
		   
		   
		   
		   }
		    
		     
}

