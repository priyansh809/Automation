package Helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverHelper {
	public static Properties prop;
	public static WebDriver driver;
	public static WebDriverWait wait;

	static { 
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\HP\\eclipse\\jee-2022-09\\eclipse\\Java\\Config\\Conig.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { 
			e.printStackTrace(); 
		}
	}
 
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			ChromeOptions option= new ChromeOptions();
			  option.addArguments("--incognito");
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver(option);

		} else if (browserName.equals("ff")) {
			FirefoxOptions option= new FirefoxOptions();
			  option.addArguments("--incognito");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(option);

		} else if (browserName.equals("edge")) {
			EdgeOptions option=new EdgeOptions();
			  option.addArguments("InPrivate");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(option);
		} else {
			System.out.println("browser is not mentioned in the list");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(prop.getProperty("URl"));

	}
	

    public WebElement waitForExpectedElement(final By by) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (Exception e) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }
    }
    public WebElement waitForExpectedElement(final By by, long waitTimeInSeconds) {
         wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (NoSuchElementException e) {
         
            return null;
        } catch (StaleElementReferenceException e) {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        }
    }

            
    
    public void clickByElementByQueryJSExecutor(final By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()", waitForExpectedElement(by));
        jse.executeScript("arguments[0].click()",waitForExpectedElement(by));
    }
    
    public void selectValueFromDropDownByWebElement(WebElement ele, String text) {
        Select dropdown = new Select(ele);
        dropdown.selectByVisibleText(text); 
    }
    
    public void hoverOnElement( By by ) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(by)).build().perform();
    }
 
   
    
  
 }

	
	

	
	
	


