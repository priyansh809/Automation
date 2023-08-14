package Java.Java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
				
				driver.manage().window().maximize();
				
				
			WebElement DropdownBtn=	driver.findElement(By.xpath("//button[@id='menu1']"));
			 DropdownBtn.click();
			  
			  
			   List<WebElement>dropdownList =driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
			   
			   
			   for(WebElement ele :dropdownList) {
				   
				  System.out.println(ele.getAttribute("innerHTML"));
				  
				  if(ele.getAttribute("innerHTML").contains("About Us")) {
					 
					  ele.click();
					    
					  
				  }else if( ele.getAttribute("innerHTML").contains("CSS")) {
					  ele.click();
					 
			    
				  }else {
					  System.out.println("Fields ");
				  }
				  
				
					 
				 }
				   
				   
			   }
				
				
			

}


