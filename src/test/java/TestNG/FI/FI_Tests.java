package TestNG.FI;

import org.testng.annotations.AfterGroups;

public class FI_Tests {
  
	@AfterGroups(groups="Logistics")/*/,dependsOnGroups="Logistics")*/
	public void someFITestsThatDependonGroupLogistics()
	{
		System.out.println("Some Tests that must be run after all Logistics Group test cases are run");
	}
	
}
