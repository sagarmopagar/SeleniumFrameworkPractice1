package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flights {
	WebDriver driver;
	
	@FindBy(id="tab-flight-tab-hp")
	WebElement flight;
	
	@FindBy(id="flight-origin-hp-flight")
	WebElement Origin;
	
	@FindBy(id="flight-destination-hp-flight")
	WebElement Destination;
	
	@FindBy(id="flight-departing-hp-flight")
	WebElement DepartingDate;
	
	@FindBy(css="button[class*=\"close\"][class*=\"datepicker\"]")
	WebElement close;
	
	@FindBy(css="form#gcw-flights-form-hp-flight button[type=\"submit\"]")
	WebElement Search;
	
	public Flights(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}

	public void ClickOnFlightsTab() {
//		flight = driver.findElement(By.id("tab-flight-tab-hp"));
		flight.click();
	}
	
	public void enterOrigin(String origin) {
		Origin.sendKeys(origin);
	}
	
	public void enterDestination(String dest) {
		Destination.sendKeys(dest);
	}	
	
	public void enterDate(String Date) {
		DepartingDate.sendKeys(Date);
	}
	
	public void closeClick() {
		close.click();
	}
	
	public void ClickSearch() {
		Search.click();
	}
}
