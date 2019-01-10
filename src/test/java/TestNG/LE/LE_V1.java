package TestNG.LE;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class LE_V1 {

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("This methods is executed at suite level. At the beginning of the execution");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("This method is executed at the suite level. At the end of the suite.");
	}

	@Test(groups="Eclipse")
	public void EclipseTest() {
		System.out.println("Eclipse Test with mave surefire");
	}
	
	@Test(groups= {"echo","random","anytime"})
	public void Echo1() {
		System.out.println("Test Method Echo1 in LE");
	}

	@Test(groups= {"echo","random","anytime"},dependsOnMethods={"Print1"})
	public void EchoHello() {
		System.out.println("Test Method EchoHello in LE");
	}

	@Test(groups= {"Smoke","Sanity","anytime"})
	public void Print1() {
		System.out.println("Test Method Print1 in LE");
	}

	@Test
	public void Print2() {
		System.out.println("Test Method Print2 in LE");
	}

	@Test(groups= {"Smoke"})
	public void Print3() {
		System.out.println("Test Method Print3 in LE");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("This method is executed before LE_V1 class");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This method is executed after LE_V1 class");
	}
}
