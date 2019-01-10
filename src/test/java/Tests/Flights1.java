package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Driver;
import Pages.Flights;

public class Flights1 {
	WebDriver driver;
	Flights flight;

	@BeforeClass
	public void setUp() {
		driver = Driver.getDriver();
		flight = new Flights(driver);
	}

	@Test
	public void ClickFlightTab() {

		driver.get("https://www.expedia.com/");
		flight.ClickOnFlightsTab();
		flight.enterOrigin("New York");
		flight.enterDestination("San Francisco");
		flight.enterDate("26.12.2018");
		flight.closeClick();
		flight.ClickSearch();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
