package Java.Java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {
	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException { 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		   driver.get("https://testuserautomation.github.io/Alerts/");
		   
		   
		   
		   
	        driver.findElement(By.xpath("//button[1]")).click();

	       Alert alert = driver.switchTo().alert();
	       
	       
	       String alertMessage=alert.getText();
	       
	        //For OK button in alert, accept the PopUp
	        //alert.sendKeys("Test Automation");
	       
	        Thread.sleep(3000);
	        
	        alert.accept();
	        
	        Thread.sleep(3000);
	     
	        driver.close();
	
	
	
	

}
}



