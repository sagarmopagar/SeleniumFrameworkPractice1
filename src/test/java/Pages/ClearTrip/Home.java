package Pages.ClearTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	WebDriver driver;
	
	@FindBy(xpath=".//ul[contains(@class,'currencyMenu')]")
	WebElement CurrencyList;
	
	@FindBy(css="form#SearchForm h1:first-of-type")
	WebElement homeHeader;
	
	@FindBy(css="h2.subTitle")
	WebElement homeSubTitle;
	
	@FindBy(css="a[class~='currencyLink']")
	WebElement currencyTab;
	
	
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getHomeHeader() {
		return homeHeader.getText();
	}
	
	public String getSubTitle() {
		return homeSubTitle.getText();
	}
	
	public int getCurrencyList() {
		
		return CurrencyList.findElements(By.xpath(".//li")).size();
	}
}
