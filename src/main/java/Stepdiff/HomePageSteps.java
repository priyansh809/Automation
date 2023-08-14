package Stepdiff;


import Helper.WebDriverHelper;
import io.cucumber.java.en.And;
import pagefile.Homepage;

public class HomePageSteps extends WebDriverHelper{   
	
	Homepage page = new Homepage();
	
	
	
	@And("user launch site URl")
	public void UserLaunchSiteURl() {
		initialization(); 
	}
	
	 @And("select allow all from cookie pop up and select over 18 age confirmation option")
	 public void SelectAgeGetpopUp() {
		page.selectCookieAgeGetpopUp();
			page.ClickPersonIcon();
			 
	 }
	 @And("^user navigates to Cart page and empty basket$")
	    public void userNavigatesToCartPageAndEmptyBasket() throws InterruptedException {
	        page.emptyBasket();
	        
	 }
	 
	 @And("user navigate to the homepage plp")
	 public void UserNavigateToTheHomepagePlp() {
		 page.UserNavigateToTheHomepagePlp();
		 
		 
	 }

	 
}

	
	


 