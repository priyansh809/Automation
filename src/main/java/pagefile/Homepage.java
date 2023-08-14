package pagefile;

import org.openqa.selenium.By;
import Helper.WebDriverHelper;

public class Homepage extends WebDriverHelper { 

	
    public By allowCookieButton = By.cssSelector("button#onetrust-accept-btn-handler"); 
	public final static By buttonAgeAllow = By.cssSelector("#btn-entry-age-allow");
	public By PersonIcon = By.cssSelector("span.icon-account");
	public By SignLink = By.cssSelector("div > div.userLoggout > div > div > div > ul.dropdown.account-dropdown> li:nth-child(1)");
	public By BasketCount = By.cssSelector("span.counter-number");
	public By BasketPrice = By.cssSelector("span.cart_details > span");
	public final static By BASKET_ICON = By.cssSelector("a.action.showcart");
	public final static By VIEW_BASKET = By.cssSelector(
			"#minicart-content-wrapper > div > div.actions.minicart-actions > div > a,a.action.viewcart.primary");
	public static final By REMOVE_ITEM_FROM_BASKETPAGE_ICON_UK_CX = By.cssSelector("button.action.primary.remove");
	public static final By CONFIRM_ITEM_REMOVAL_FROM_BASKETPAGE_UK_CX = By.cssSelector("a.action.action-delete");
	public static final By UserNavigateToTheHomepagePlp = By.cssSelector("div > div > ul > li.level0.category-item.icon-vype-offers.offers");
	
				 
	
	
	
	public void selectCookieAgeGetpopUp() {
		waitForExpectedElement(allowCookieButton, 20);
		waitForExpectedElement(allowCookieButton, 20).click();
		waitForExpectedElement(buttonAgeAllow, 20);
		 waitForExpectedElement(buttonAgeAllow, 20).click();
		 waitForExpectedElement(PersonIcon, 15);
		 waitForExpectedElement(PersonIcon, 20).click();
	}
	
	
	public void ClickPersonIcon() {
		waitForExpectedElement(PersonIcon,15);
		hoverOnElement(PersonIcon);
		waitForExpectedElement(SignLink).click();
	}
	public boolean isemptyBasket() {
		waitForExpectedElement(BASKET_ICON, 10);
		return waitForExpectedElement(BasketPrice,20).getText().contains("£0.00");
	}

	public void emptyBasket() {
		if (!isemptyBasket()) {
			try {
				waitForExpectedElement(VIEW_BASKET, 10).click();
			} catch (Exception e) {
				waitForExpectedElement(BASKET_ICON, 10).click();
				waitForExpectedElement(VIEW_BASKET, 10).click();
			}
			while (driver.findElements(REMOVE_ITEM_FROM_BASKETPAGE_ICON_UK_CX).size() != 0) {
				waitForExpectedElement(REMOVE_ITEM_FROM_BASKETPAGE_ICON_UK_CX, 15).click();
				try {
					waitForExpectedElement(CONFIRM_ITEM_REMOVAL_FROM_BASKETPAGE_UK_CX,15).click();
				} catch (Exception ex) {
					clickByElementByQueryJSExecutor(CONFIRM_ITEM_REMOVAL_FROM_BASKETPAGE_UK_CX);
				}
			}
		}
	
	
}
			
			public void UserNavigateToTheHomepagePlp() {
				waitForExpectedElement(UserNavigateToTheHomepagePlp, 15);
				hoverOnElement(UserNavigateToTheHomepagePlp);
				
			}
				
			
				
				
				
			}
		
	
	
	
	
	
	

