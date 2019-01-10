package Tests.ClearTrip.HomePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Driver;
import Base.JProperties;
import Pages.ClearTrip.Home;

public class HomeBasicTest {
  
	WebDriver driver;// = Driver.getDriver();
	Home home;// = new Home(driver);
	
	@BeforeClass
	public void setUp() {
		driver = Driver.getDriver();
		home = new Home(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown(){
	driver.quit();	
	}
	
	@Test
  public void HomeAssertTitles() {
	driver.get(JProperties.getProperty("url"));
//	while(home.getPageTitle()!="#1 Site for Booking Flights, Hotels, Packages, Trains & Local activities.") {
//		
//	}
	System.out.println(home.getPageTitle());
	System.out.println(home.getHomeHeader());
	System.out.println(home.getSubTitle());
	Assert.assertEquals(home.getPageTitle(), JProperties.getProperty("homePageTitle"));
	Assert.assertEquals(home.getHomeHeader(), JProperties.getProperty("homeHeader"));
	Assert.assertEquals(home.getSubTitle(), JProperties.getProperty("homeSubTitle"));
	
  }
}
