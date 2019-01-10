package TestNG.LE;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LECustomizations {

  @BeforeTest(groups="LESettings")
  public void beforeTest() {
System.out.println("Customizations specific to LE. To be run before all LE Tests");	  
  }

  @AfterTest(groups="LESettings")
  public void afterTest() {
	  System.out.println("Customizations specific to LE. To be run after all LE Tests");
  }

}
