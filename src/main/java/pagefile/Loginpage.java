package pagefile;
import org.openqa.selenium.By;

import Helper.WebDriverHelper; 

public class Loginpage extends WebDriverHelper { 
	Homepage page = new Homepage(); 
	
	
	public By EMAIL_InputBox = By.cssSelector("input#email");  
	public By Password_InputBox = By.cssSelector("input#pass"); 
	public By Sign_InputBox = By.cssSelector("button#send2"); 
	public By Error_Message=By.cssSelector("div.message-error.error.message");
	
	
	
	public void  loginuser(String useranme,String password) {
		waitForExpectedElement(EMAIL_InputBox, 15).sendKeys((useranme));
		waitForExpectedElement(Password_InputBox, 15).sendKeys((password));
		waitForExpectedElement(Sign_InputBox, 15).click();
		
	}
	
	public void userLoginValidation() {
		//String ActulTitle = driver.getTitle();
		//String ExpectedTitle = prop.getProperty("LoginPageTitle");
		
		//assertEquals(ExpectedTitle, ActulTitle);
	}
	
	
			public void  invaildusername(String invaildusername,String password1) {
				waitForExpectedElement(EMAIL_InputBox, 15).sendKeys((invaildusername));
				waitForExpectedElement(Password_InputBox, 15).sendKeys((password1));
				waitForExpectedElement(Sign_InputBox, 15).click();
			waitForExpectedElement(Error_Message, 20).isDisplayed();
		
	}
			
			public void  invaildpassword(String useranme2,String invaildpassword) {
				waitForExpectedElement(EMAIL_InputBox, 15).sendKeys((useranme2));
				waitForExpectedElement(Password_InputBox, 15).sendKeys((invaildpassword));
				waitForExpectedElement(Sign_InputBox, 15).click();
			waitForExpectedElement(Error_Message, 20).isDisplayed();
			}
			
		
		public void  blankpassword(String useranme3,String blankpassword){
			waitForExpectedElement(EMAIL_InputBox, 15).sendKeys((useranme3));
			waitForExpectedElement(Password_InputBox, 15).sendKeys((blankpassword));
			waitForExpectedElement(Sign_InputBox, 15).click();
		waitForExpectedElement(Error_Message, 20).isDisplayed();
			
		waitForExpectedElement(Error_Message, 20).isDisplayed();
		}
		
		public void  blankusername(String blankusername,String password4){
			waitForExpectedElement(EMAIL_InputBox, 15).sendKeys((blankusername));
			waitForExpectedElement(Password_InputBox, 15).sendKeys((password4));
			waitForExpectedElement(Sign_InputBox, 15).click();
		waitForExpectedElement(Error_Message, 20).isDisplayed();
			
		waitForExpectedElement(Error_Message, 20).isDisplayed();		
		
	}
		
		
}
		
		
		
		
		
	

