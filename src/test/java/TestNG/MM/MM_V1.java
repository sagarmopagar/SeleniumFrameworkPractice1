package TestNG.MM;

import org.testng.annotations.Test;

public class MM_V1 {

	@Test(groups= {"echo","random","anytime"})
	public void Echo1() {
		System.out.println("Test Method Echo1 in MM");
	}
	
	@Test
	public void EchoHello() {
		System.out.println("Test Method EchoHello in MM");
	}
	
	@Test(groups="Smoke",enabled=true)
	public void Print1()
	{
		System.out.println("Test Method Print1 in MM");
	}

}
