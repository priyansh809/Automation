package Java.Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {
	
	public static void main(String[] args) {
		
	 WebDriverManager.chromedriver().setup();
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 
	 WebElement userInputField=driver.findElement(By.xpath("//input[@name=\"email\"]"));
	 
		userInputField.sendKeys("aaravsaxena8090@gmail.com");
		
		
		 WebElement userInputPass= driver.findElement(By.xpath("//input[@id='pass']"));
		 
			userInputPass.sendKeys("aarav@8090");
			
	WebElement LoginButton = driver.findElement(By.xpath("//button[@name='login']"));
			
	LoginButton.click();
			
		
		
		
		
	}
	
	
	
	
	

}
