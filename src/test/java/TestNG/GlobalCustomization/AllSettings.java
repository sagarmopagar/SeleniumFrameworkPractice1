package TestNG.GlobalCustomization;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllSettings {
  
  @BeforeSuite(groups="AllSettings")
  public void beforeSuite() {
	  System.out.println("Global Settings for ERP. To be run before any tests in a Suite are run");
  }

  @AfterSuite(groups="AllSettings")
  public void afterSuite() {
	  System.out.println("Global Settings for ERP. To be run after all tests in a Suite are run");
  }
  

}
