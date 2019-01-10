package TestNG.Maven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2 {

	@Test(groups="class2")
	@Parameters({"username","password"})
	public void class2_01_Test(String username, String password) {
		System.out.println("Class2 01 Test with maven surefire plugin");
		System.out.println(username+"::"+password);
	}
	
}
