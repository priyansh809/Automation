package Java.Java;

import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.WebDriverHelper;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.util.ArrayIterator;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle extends WebDriverHelper{

	public static void main(String[] args) {

			
			driver.get("https://www.naukri.com/");
			
			driver.manage().window().maximize();
			
			WebElement RemoteLink =driver.findElement(By.xpath("//div[@class='ntc__chips-row']/a[@tittle='Remote']"));
			
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
			
			wait.until(ExpectedConditions.visibilityOf(RemoteLink));
			
			String parentwindow= driver.getWindowHandle();
			
			System.out.println(parentwindow);
			RemoteLink.click();
			
			Set<String>childwindows=driver.getWindowHandles();
			java.util.Iterator<String> i= childwindows.iterator();

			 while(i.hasNext()) {
				 
				 String child=i.next();
				 
				 if(!parentwindow.equals(child)) {
					 
					 driver.switchTo().window(child);
					 
					String childTitle= driver.getTitle();
					System.out.println(childTitle);
					 try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					 
					 driver.close();
				
	}
				 
	      	 driver.switchTo().window(parentwindow);
				 System.out.println(driver.getTitle());

	
	
	
	
}
	}
}
