package Tests.Flights;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Driver;
import Pages.Flights;

public class LinksTest {

	WebDriver driver;
	Flights flight;

	@BeforeClass
	public void setUp() {
		driver = Driver.getDriver();
		flight = new Flights(driver);
	}

	@Test
	public void TestAllLinksOnPage() {
		String href = null;
		URL url;
		driver.get("https://www.expedia.com/");
		List<WebElement> AllLinks = ListOfLinks();

		for (WebElement e : AllLinks) {

			href = e.getAttribute("href");
			try {
				url = new URL(href);

				System.out.println("href: " + href + " message: " + LinkStatus(url));

			} catch (Exception e1) {

			}
		}

//		flight.ClickOnFlightsTab();
//		flight.enterOrigin("New York");
//		flight.enterDestination("San Francisco");
//		flight.enterDate("26.12.2018");
//		flight.closeClick();
//		flight.ClickSearch();
	}

	public String LinkStatus(URL url) {
		String responseMessage = null;

		try {
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			http.connect();
			responseMessage = http.getResponseMessage();
			http.disconnect();
		} catch (Exception e) {
			System.out.println("Connection Couldn't be established");
		}

		return responseMessage;

	}

	public List<WebElement> ListOfLinks() {

		List<WebElement> list1 = new ArrayList<WebElement>();
		List<WebElement> list2 = new ArrayList<WebElement>();
		List<WebElement> linksList = new ArrayList<WebElement>();

		list1 = driver.findElements(By.tagName("a"));
		list2 = driver.findElements(By.tagName("img"));
		list1.addAll(list2);

		for (WebElement e : list1) {

			if (e.getAttribute("href") != null) {

				linksList.add(e);

			}

		}

		return linksList;
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
