package Stepdiff;

import Helper.WebDriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pagefile.Loginpage;
 
public class Loginstepp extends WebDriverHelper {
	
	Loginpage login = new Loginpage();
	
	

        @Given("user login into application with valid username and password")
         public void loginuser() { 
		 login.loginuser(prop.getProperty("useranme"),prop.getProperty("password"));
		 login.userLoginValidation();
		 
	 }
        
        @Given("user login into application with invaildusername and password")
        public void Invaildusername() {
        	login.loginuser(prop.getProperty("invaildusername"),prop.getProperty("password1"));
        	login.userLoginValidation();
        }
        	 
       

        @Given("user login into application with valid username and invaildpassword")
        public void invaildpassword(){
        	login.loginuser(prop.getProperty("useranme2"),prop.getProperty("password2"));
        	login.userLoginValidation();
        	 
        }
        @Given("user login into application with valid username and blankpassword")
        public void blankpassword() {
            login.loginuser(prop.getProperty("username3"),prop.getProperty("password3"));
            login.userLoginValidation();
        }

        @Given("user login into application with valid blankusername and password")
        public void blankusername() {
        	login.loginuser(prop.getProperty("username4"),prop.getProperty("passwor4"));
            login.userLoginValidation();
        }
        

        @Given("user login into application with valid blankusername and blankpassword")
        public void blankusernameblankpassword() {
        	login.loginuser(prop.getProperty("username5"),prop.getProperty("passwor6"));
            login.userLoginValidation();
        }
        
	 @Then("assert error message '(,*)'")
	 
	 public void assertErrorMessage(String expected) {
		 driver.getPageSource().toLowerCase().contains(prop.getProperty(expected).toLowerCase());
		 
	 }
}




