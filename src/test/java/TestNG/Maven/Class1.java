package TestNG.Maven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {

	@Test(groups="class1")
	@Parameters({"username","password"})
	public void class1_01_Test(String username, String password) {
		System.out.println("Class1 01 Test with maven surefire plugin");
		System.out.println(username+"::"+password);
//		System.out.println(System.getProperty("prop.key"));
		System.out.println(System.getProperty("browser"));
		
	}
	
	@Test
	public void class1_02_Test() {
		System.out.println("Class 1 02 Test : Single test from command prompt using maven");
	}
	
}
