package Selenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.Driver;
import Base.JProperties;

public class InterviewPreparation {

	@Test
	public void AssertTest() throws IOException {
		
		WebDriver driver = Driver.getDriver();
		System.out.println(JProperties.getProperty("url"));
		driver.get(JProperties.getProperty("url"));
		driver.quit();
	}
	
}
