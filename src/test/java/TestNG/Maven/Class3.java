package TestNG.Maven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class3 {

	@Test(groups="class3")
	public void class3_01_Test() {
		System.out.println("Class3 01 Test with maven surefire plugin");
	}
	
	@Test
	public void class3_02_Test() {
		System.out.println("Class3 02 Test with maven surefire plugin");
	}
}
